package exercism.easy;

import java.util.ArrayList;

public class PangramChecker {
    private final static int LETTERS_IN_ALPHABET = 26;
    public boolean isPangram(String input) {
        var pangram = new ArrayList<Character>();
        var letters = input.replaceAll("[\\W\\d]", "").toLowerCase().toCharArray();
        for (char letter: letters) {
            if (!pangram.contains(letter)) {
                pangram.add(letter);
            }

            if (pangram.size() == LETTERS_IN_ALPHABET) {
                return true;
            }
        }

        return false;
    }

    public boolean isPangramTwo(String input) {
        return input.toLowerCase().chars().filter(Character::isLetter).distinct().count() == LETTERS_IN_ALPHABET;
    }
}
