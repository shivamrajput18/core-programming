package Built_in_Methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input from user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Perform date arithmetic
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Define formatters for different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Print results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("Modified Date: " + modifiedDate.format(formatter));
        System.out.println("Formatted Date (dd/MM/yyyy): " + date.format(format1));
        System.out.println("Formatted Date (yyyy-MM-dd): " + date.format(format2));
        System.out.println("Formatted Date (EEE, MMM dd, yyyy): " + date.format(format3));
    }
}
