// Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

// Hint => 
// Write a Method to get the name of the month. For this define a month Array to store the names of the months
// Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 

// Write a method to get the first day of the month using the Gregorian calendar algorithm
// y0 = y − (14 − m) / 12
// x = y0 + y0/4 − y0/100 + y0/400
// m0 = m + 12 × ((14 − m) / 12) − 2
// d0 = (d + x + 31m0 / 12) mod 7

import java.util.Scanner;

public class Calender {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static String getMonthName(int month) {
        String[] monthArray = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        return monthArray[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        return daysArray[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        // System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.println("Calendar for " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        int daysInMonth = getDaysInMonth(month, year);

        for (int i = 1; i <= daysInMonth; i++) {
            if (i < 10) {
                System.out.print(" " + i + "  ");
            } else {
                System.out.print(i + "  ");
            }

            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();

    }
}
