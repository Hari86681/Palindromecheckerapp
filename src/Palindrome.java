import java.util.Scanner;
class PalindromeChecker {
        public static void main(String[] args) {
            String str = "madam";
            char[] arr = str.toCharArray();
            boolean isPalindrome = true;
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("The string is a palindrome");
            } else {
                System.out.println("The string is not a palindrome");
            }
        }
    }