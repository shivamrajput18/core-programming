import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of the triangle (in inches): ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        double heightCm = height * 2.54;
        double heightFeet = height / 12;
        double heightInches = height % 12;
        
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;
    
        System.out.println("Your Height in cm is " + heightCm + " cm, while in feet is " + (int)heightFeet + " feet and " + heightInches + " inches.");
        System.out.println("The area of the triangle is " + areaInches + " square inches (" + areaCm + " square cm). ");
        
        scanner.close();
    }
}
