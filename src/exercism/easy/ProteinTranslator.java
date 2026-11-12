package exercism.easy;

import java.util.ArrayList;
import java.util.List;

public class ProteinTranslator {
    public List<String> translate(String rnaSequence) {
        if ((rnaSequence.length() % 3) != 0) {
            throw new IllegalArgumentException("Invalid codon");
        }

        var proteins = new ArrayList<String>();


        var count = 0;
        while (count < rnaSequence.length()) {
            var rna = rnaSequence.substring(count, count + 3);

            switch (rna) {
                case "AUG":
                    proteins.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    proteins.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    proteins.add("Leucine");
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    proteins.add("Serine");
                    break;
                case "UAU":
                case "UAC":
                    proteins.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    proteins.add("Cysteine");
                    break;
                case "UGG":
                    proteins.add("Tryptophan");
                    break;
                case "UAA":
                case "UAG":
                case "UGA":
                    count = rnaSequence.length();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid codon");
            }

            count += 3;
        }

        return proteins;
    }
}
