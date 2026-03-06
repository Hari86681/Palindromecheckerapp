import java.util.Deque;
import java.util.ArrayDeque;
        class Palindrome {
            public static void main(String[] args) {
                Deque<Integer> deque = new ArrayDeque<>();
                deque.addFirst(10);
                deque.addLast(20);
                deque.addLast(30);
                int front = deque.peekFirst();
                int rear = deque.peekLast();
                if (front == rear) {
                    System.out.println("Front and Rear elements are equal");
                } else {
                    System.out.println("Front element: " + front);
                    System.out.println("Rear element: " + rear);
                    System.out.println("Front and Rear elements are different");
                }
            }
        }