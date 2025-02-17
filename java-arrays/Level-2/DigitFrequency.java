import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create a frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];

        // Loop through each digit of the number
        while (number != 0) {
            int digit = number % 10;    // Get the last digit
            frequency[digit]++;         // Increase the frequency of the digit
            number /= 10;               // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}
