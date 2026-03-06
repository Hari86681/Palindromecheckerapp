import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
    class Palindrome {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("LIFO using Stack:");
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(10);
            queue.add(20);
            queue.add(30);
            System.out.println("FIFO using Queue:");
            while (!queue.isEmpty()) {
                System.out.println(queue.remove());
            }
        }
    }