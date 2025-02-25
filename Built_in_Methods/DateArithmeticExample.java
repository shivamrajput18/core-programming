package Built_in_Methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input from user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Perform date arithmetic
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Print results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("Modified Date: " + modifiedDate.format(formatter));
    }
}
