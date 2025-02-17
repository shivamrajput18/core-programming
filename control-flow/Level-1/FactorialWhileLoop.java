import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;  
            int i = n;
            while (i > 0) {
                factorial *= i;
                i--;
            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        }

    }
}
