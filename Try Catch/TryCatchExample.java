public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;  // Division by zero (ArithmeticException)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block will always execute
            System.out.println("Execution completed.");
        }
    }
}
