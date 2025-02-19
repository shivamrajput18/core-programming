import java.util.Scanner;

public class RemainderQuotientCalculator {
    
    // Method to find remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        if (divisor != 0) {
            // Finding quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);
            
            // Displaying the result
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        scanner.close();
    }
}
