import java.util.Scanner;

public class NumberCheck {
    
    // Method to check whether a number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Checking the number
        int result = checkNumber(num);
        
        // Displaying the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();
    }
}
