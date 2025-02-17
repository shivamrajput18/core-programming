import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) { 
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) { 
                System.out.println(num + " is negative.");
            } else { 
                System.out.println(num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[4];

        if (firstElement == lastElement) {
            System.out.println("The first and last elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
        
        sc.close();
    }
}
