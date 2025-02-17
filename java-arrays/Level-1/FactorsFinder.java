import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for invalid input
        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        int maxFactor = 10; // Initial size
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find and store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Store factor in array
                factors[index++] = i;

                // Expand array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] newFactors = new int[maxFactor];

                    // Copy old values manually
                    for (int j = 0; j < index; j++) {
                        newFactors[j] = factors[j];
                    }

                    factors = newFactors; // Assign new expanded array
                }
            }
        }

        // Print factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
