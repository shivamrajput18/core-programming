// Program to reverse the digits of a number.
import java.util.Scanner;

// Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
// Hint => 
// Take user input for a number. 
// Find the count of digits in the number. 
// Find the digits in the number and save them in an array
// Create an array to store the elements of the digits array in reverse order
// Finally, display the elements of the array in reverse order


public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        // Find the count of digits in the number
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] digits = new int[count];
        temp = number;

        // Find the digits in the number and save them in an array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] reverseDigits = new int[count];

        // Create an array to store the elements of the digits array in reverse order
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - i - 1];
        }
        
        System.out.print("Reverse of " + number + " is ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }
        sc.close();
    }
}