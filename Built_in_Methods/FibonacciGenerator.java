package Built_in_Methods;

import java.util.Scanner;

public class FibonacciGenerator {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void generateFibonacci(int terms) {
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        
        if (terms < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            generateFibonacci(terms);
        }
        
        scanner.close();
    }
}
