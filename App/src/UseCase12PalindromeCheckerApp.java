public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
