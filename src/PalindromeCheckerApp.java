

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
    class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "level";

            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            // Enqueue and push characters
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                queue.add(ch);   // FIFO
                stack.push(ch);  // LIFO
            }

            boolean isPalindrome = true;

            // Compare dequeue vs pop
            while (!queue.isEmpty()) {
                if (queue.remove() != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is not a Palindrome");
            }
        }
    }