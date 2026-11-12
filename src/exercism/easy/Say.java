package exercism.easy;

import exercism.easy.help.EnglishNumbers;

public class Say {
    public String say(long number) {
        if (number < 0 && number > 999_999_999_999L) {
            throw new IllegalArgumentException();
        }
        var response = new StringBuilder();
        while (number > 0) {
            var leftOver = number / 10;

            response.append(EnglishNumbers.ONE.toString().toLowerCase());

            number /= 10;
        }

        return response.toString();
    }
}
