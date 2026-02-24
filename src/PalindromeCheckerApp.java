

    import java.util.Stack;
import java.util.Scanner;

    class PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Palindrome Checker App");
            System.out.println("UC5: Stack-Based Palindrome Checker");
            System.out.print("Enter a string: ");

            String input = scanner.nextLine();

            // Convert to lowercase and remove non-alphabet characters (optional but recommended)
            String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

            Stack<Character> stack = new Stack<>();

            // Step 1: Push characters into the stack
            for (int i = 0; i < cleanedInput.length(); i++) {
                stack.push(cleanedInput.charAt(i));
            }

            // Step 2: Pop and compare
            boolean isPalindrome = true;
            for (int i = 0; i < cleanedInput.length(); i++) {
                if (cleanedInput.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Step 3: Print result
            if (isPalindrome) {
                System.out.println("Result: The string is a palindrome.");
            } else {
                System.out.println("Result: The string is NOT a palindrome.");
            }

            scanner.close();
        }
    }