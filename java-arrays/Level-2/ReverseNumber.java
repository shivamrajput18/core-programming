import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        int count = 0;
        int temp_number = number;

        // Find the count of digits in the number
        while (temp_number != 0) {
            temp_number /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp_number = number;

        // Find the digits in the number and save them in an array
        for (int i = 0; i < count; i++) {
            digits[i] = temp_number % 10;
            temp_number /= 10;
        }

        
        System.out.print("Reverse of " + number + " is ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}