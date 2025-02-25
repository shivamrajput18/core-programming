package Built_in_Methods;

import java.util.Scanner;

public class MaxOfThree {
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + maxOfThree(num1, num2, num3));
        
        scanner.close();
    }
}
