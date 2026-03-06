import java.util.Stack;
class Palindrome {
        public static void main(String[] args) {
            String str = "madam";
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }
            if (str.equals(reversed)) {
                System.out.println("The string is a palindrome");
            } else {
                System.out.println("The string is not a palindrome");
            }
        }
    }