package exercism.easy;

import exercism.easy.help.Classification;

public class NaturalNumber {
    private final Integer number;

    public NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Provide a natural number (positive number)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        var sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            return Classification.PERFECT;
        } else if (sum > number) {
            return Classification.ABUNDANT;
        }

        return Classification.DEFICIENT;
    }
}
