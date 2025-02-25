import java.util.Scanner;

public class NumberFormatExcep {

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number as a string: ");
        Scanner sc = new Scanner(System.in);
        String numberText = sc.nextLine();
     
        handleNumberFormatException(numberText);

        sc.close();
    }
}
