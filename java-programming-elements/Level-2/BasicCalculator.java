import java.util.Scanner; 

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? (number1 / number2) : Double.NaN; 

        System.out.printf("The addition, subtraction, multiplication, and division of numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %s\n",
                          number1, number2, addition, subtraction, multiplication, 
                          (number2 != 0) ? String.format("%.2f", division) : "undefined");

        
    }
}