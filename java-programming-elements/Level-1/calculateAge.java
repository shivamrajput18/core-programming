import java.util.*;

public class calculateAge {
    public static int calculateAge(int birthYear, int currentYear) {
        return currentYear - birthYear;
    }

    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
    
        int age = calculateAge(birthYear, currentYear);
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}