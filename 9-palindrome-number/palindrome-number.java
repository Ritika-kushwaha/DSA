class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // 1. Negative numbers are not palindromes (e.g., -121 reads as 121-)
        // 2. Numbers ending in 0 are not palindromes, unless the number itself is 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        // Reversing only the second half of the number to avoid integer overflow
        while (x > reversedNumber) {
            reversedNumber = (reversedNumber * 10) + (x % 10);
            x /= 10;
        }

        // For odd-length numbers, we can get rid of the middle digit by reversedNumber / 10
        // E.g., for 121, at the end of the loop x = 1, reversedNumber = 12
        // So we check if x == reversedNumber or x == reversedNumber / 10
        return x == reversedNumber || x == reversedNumber / 10;
    }
}