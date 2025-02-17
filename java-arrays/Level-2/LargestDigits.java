import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; // Maximum size for the array
        int[] digits = new int[maxDigit]; // Array to store digits
        int index = 0; // Index to track number of digits

        // Step 2: Extract digits and store in array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // Get last digit
            number /= 10; // Remove last digit
            index++;
        }

        // Step 3: Initialize largest and second-largest variables
        int largest = -1;
        int secondLargest = -1;

        // Step 4: Find the largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Previous largest becomes second largest
                largest = digits[i]; // New largest found
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // New second largest found
            }
        }

        // Step 5: Display results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found (all digits are the same).");
        }

        sc.close();
    }
}
