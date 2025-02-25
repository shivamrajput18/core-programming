package Built_in_Methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take first date input from user
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

        // Take second date input from user
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

       
    }
}
