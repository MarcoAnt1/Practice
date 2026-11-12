package hackerrank.algorithms.easy;

import java.util.List;

public class SimpleArraySum {
    public int solution(List<Integer> ar) {
        int sum = 0;
        for (int value: ar) {
            sum += value;
        }

        return sum;
    }
}
