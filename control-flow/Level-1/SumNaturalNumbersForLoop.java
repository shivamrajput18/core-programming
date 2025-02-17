import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println(" Both computations match. The result is correct!");
            } else {
                System.out.println(" There is a mismatch. Please check the logic.");
            }
        }

    }
}
