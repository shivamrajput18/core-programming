import java.util.Scanner;

public class HandshakeCalculator {
    
    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        // Calculating maximum handshakes
        int handshakes = calculateHandshakes(n);
        
        // Displaying the result
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);
        
        scanner.close();
    }
}
