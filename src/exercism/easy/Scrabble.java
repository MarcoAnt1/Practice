package exercism.easy;

import java.util.List;

public class Scrabble {
    private final char[] letters;
    private final String word;

    public Scrabble(String word) {
        this.word = word;
        this.letters = word.toUpperCase().toCharArray();
    }

    public int getScore() {
        int score = 0;

        for (char letter: letters) {
            switch (letter) {
                case 'A','E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T':
                    score += 1;
                    break;
                case 'D', 'G':
                    score += 2;
                    break;
                case 'B', 'C', 'M', 'P':
                    score += 3;
                    break;
                case 'F', 'H', 'V', 'W', 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J', 'X':
                    score += 8;
                    break;
                case 'Q', 'Z':
                    score += 10;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }

        return score;
    }

    public int getScore_V2() {
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, 1);
            if ("AEIOULNRST".contains(letter)) {
                score++;
            } else if ("DG".contains(letter)) {
                score += 2;
            } else if ("BCMP".contains(letter)) {
                score += 3;
            } else if ("FHWY".contains(letter)) {
                score += 4;
            } else if ("K".contains(letter)) {
                score += 5;
            } else if ("JX".contains(letter)) {
                score += 8;
            } else {
                score += 10;
            }
        }

        return score;
    }


}
