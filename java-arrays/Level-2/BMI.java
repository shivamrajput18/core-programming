// Program to calculate BMI and determine weight status.
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input weight and height for each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble() / 100;

            bmi[i] = weights[i] / (heights[i] * heights[i]); // Calculate BMI

            if (bmi[i] < 18.5) {  
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) { 
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else
                status[i] = "Obese";

        }

        System.out.println("Height | Weight | BMI | Status");

        for (int i = 0; i < n; i++) {
            System.out.println(heights[i] + "m | " + weights[i] + "kg | " + bmi[i] + " | " + status[i]);
        }
        sc.close();
    }
}