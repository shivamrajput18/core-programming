import java.util.Scanner;

public class IllegalArgumentExcep {
    
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        // This will cause an IllegalArgumentException
        String sub = text.substring(5, 2); // Start index > End index
        System.out.println("Substring: " + sub);
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
        try {
            String sub = text.substring(5, 2); // Start index > End index
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demonstrating IllegalArgumentException
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
   
        handleIllegalArgumentException(text);

        scanner.close();
    }
}
