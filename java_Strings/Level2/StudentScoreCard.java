import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numOfStudents) {

        int[][] scores = new int[numOfStudents][3];

        for (int i = 0; i < numOfStudents; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 90); // Physics score
            scores[i][1] = 10 + (int) (Math.random() * 90); // Chemistry score
            scores[i][2] = 10 + (int) (Math.random() * 90); // Math score
        }

        return scores;
    }

    // Method to calculate the total, average, and percentages for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
            results[i][3] = determineGrade(percentage);
        }

        return results;
    }

    // Method to determine the grade based on the percentage
    public static char determineGrade(double percentage) {
        if (percentage >= 80)
            return 'A';
        if (percentage >= 70)
            return 'B';
        if (percentage >= 60)
            return 'C';
        if (percentage >= 50)
            return 'D';
        if (percentage >= 40)
            return 'E';
        return 'F';
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student   Physics  Chemistry Math        Total    Average  Percentage  Grade");

        for (int i = 0; i < scores.length; i++) {
            String output = String.format("%-10d %-8d %-10d %-10d %-8.0f %-8.2f %-10.2f %-10c",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], (char) results[i][3]);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numOfStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateScores(numOfStudents);

        // Calculate the total, average, percentage, and grade for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScoreCard(scores, results);

        scanner.close();
    }
}
