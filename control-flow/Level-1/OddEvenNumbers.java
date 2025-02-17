import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0).");
        } else {
            System.out.println("Even and Odd Numbers from 1 to " + number + ":");

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

    }
}
