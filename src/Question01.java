import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Question01 {
    public int findMinOperations(String processingQueue) {
        char[] pattern = { 'a', 'b', 'c' };
        var chars = processingQueue.toLowerCase().toCharArray();

        int ops = 0;
        int expected = 0;

        for (char actual : chars) {
            while (pattern[expected] != actual) {
                ops++;
                expected = (expected + 1) % 3;
            }
            expected = (expected + 1) % 3;
        }

        while (expected != 0) {
            ops++;
            expected = (expected + 1) % 3;
        }

        return ops;
    }

    public String plusMult(List<Integer> A) {
        var odds = new ArrayList<Integer>();
        var evens = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); i++) {
            if (i % 2 == 0) {
                odds.add(A.get(i));
            } else {
                evens.add(A.get(i));
            }
        }

        long odd = evaluate(odds);
        long even = evaluate(evens);

        if (odd > even) return "ODD";
        if (even > odd) return "EVEN";

        return "NEUTRAL";
    }

    private long evaluate(List<Integer> group) {
        long total = 0;
        int i = 0;
        while (i < group.size()) {
            if (i + 1 < group.size()) {
                total += (long) group.get(i) * group.get(i + 1);
                i += 2;
            } else {
                total += group.get(i);
                i++;
            }
        }
        return total;
    }
}
