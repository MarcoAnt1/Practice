package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/// 9. Palindrome Number
public class IsPalindrome {
    public boolean solution(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int temp = x;

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        return reverse == x;
    }
}
