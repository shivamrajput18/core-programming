import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return;
        }

        // Create a String array to store results
        String[] results = new String[num + 1];

        // Loop from 0 to num and apply FizzBuzz logic
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results in the given format
        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
