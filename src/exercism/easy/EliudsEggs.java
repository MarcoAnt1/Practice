package exercism.easy;

public class EliudsEggs {
    public int eggCount(int number) {
        var count = 0;
        var binaryChars = intToBinary(number).toCharArray();
        for (char value: binaryChars) {
            if (value == '1') {
                count++;
            }
        }

        return count;
    }

    public int eggCountV2(int number) {
        var count = 0;

        while (number > 0) {
            if (!(number % 2 == 0)) {
                count++;
            }

            number /= 2;
        }
        return count;
    }

    public int eggCountV3(int number) {
        var count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }

            number >>= 1;
        }

        return count;
    }

    private String intToBinary(int n) {
        var s = new StringBuilder();
        while (n > 0) {
            s.insert(0, ((n % 2) == 0 ? "0" : "1"));
            n = n / 2;
        }

        return s.toString();
    }
}
