import java.util.Scanner;

public class feetToYard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        System.out.println("The distance in yards is: " + distanceInYards + " yards.");
        System.out.println("The distance in miles is: " + distanceInMiles + " miles.");
        
        scanner.close();
    }
}
