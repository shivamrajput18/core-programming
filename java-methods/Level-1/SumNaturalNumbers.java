import java.util.Scanner;

public class SumNaturalNumbers {
    
    // Method to find sum of n natural numbers using loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            // Calculating sum
            int sum = findSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();
    }
}
