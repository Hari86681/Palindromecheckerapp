class Palindrome {
    public static void main(String[] args) {
        String str = "Never Odd Or Even";
        str = str.replaceAll("\\s", "").toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}