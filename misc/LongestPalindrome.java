//https://atcoder.jp/contests/abc320/tasks/abc320_b

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();

        int maxPalindromeLength = 1;

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String substring = S.substring(i, j);
                if (isPalindrome(substring)) {
                    maxPalindromeLength = Math.max(maxPalindromeLength, substring.length());
                }
            }
        }

        System.out.println(maxPalindromeLength);
    }

    private static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}


// simple to understand palindrome substring using string builder reverse
