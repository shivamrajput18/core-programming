import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int result1 = num1 + num2 * num3;   
        int result2 = num1 * num2 + num3;  
        int result3 = num3 + num1 / num2;  
        int result4 = num1 % num2 + num3;  

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4 + ".");

    }
}
