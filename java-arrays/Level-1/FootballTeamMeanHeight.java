import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Get input values for the heights of the players
        System.out.println("Enter the heights of 11 players:");

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();  // Store each player's height in the array
            sum += heights[i];  // Add the height to the sum
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Display the mean height of the football team
        System.out.println("\nThe mean height of the football team is: " + mean);

        // Close the scanner
        sc.close();
    }
}
