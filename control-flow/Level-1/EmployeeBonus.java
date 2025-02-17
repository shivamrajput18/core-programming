import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05; 
            System.out.println("Congratulations! You are eligible for a bonus.");
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No bonus. You need more than 5 years of service.");
        }

    }
}
