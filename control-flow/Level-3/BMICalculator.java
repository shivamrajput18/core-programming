import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();
        
        height /= 100;
        double bmi = weight / (height * height);
        
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi <= 18.4)
            System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi < 24.9)
            System.out.println("Normal weight");
        else if (bmi >= 25 && bmi < 39.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        
    }
}
