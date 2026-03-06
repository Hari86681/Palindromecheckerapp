class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
class PalindromeLinkedList {
    Node head;

    void add(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    boolean isPalindrome() {
        String original = "";
        String reverse = "";
        Node temp = head;

        while (temp != null) {
            original += temp.data;
            reverse = temp.data + reverse;
            temp = temp.next;
        }

        return original.equals(reverse);
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();

        String str = "madam";
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        if (list.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}