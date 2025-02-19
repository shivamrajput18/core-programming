import java.util.Scanner;

public class TriangleRunCalculator {
    
    // Method to calculate number of rounds needed
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);  //5km = 5000m , round=distance/perimeter
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();
        
        // Calculating the number of rounds required
        int rounds = calculateRounds(side1, side2, side3);
        
        // Displaying the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run.");
        
        scanner.close();
    }
}
