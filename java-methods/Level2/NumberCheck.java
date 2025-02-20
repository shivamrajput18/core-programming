
// Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
// Hint => 
// Write a Method to Check whether the number is positive or negative
// Write a Method to check whether the number is even or odd
// Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
// In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
// If the number is negative, print negative. 
// Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less

public class NumberCheck {

    public static boolean isPositive(int n) {
        return n > 0 ? true : false;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0 ? true : false;
    }

    public static int compare(int n, int m) {
        if (n > m)
            return 1;
        if (n < m)
            return -1;
        return 0;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 2, -3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " is positive and even");
                }
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }

        if (compare(arr[0], arr[arr.length - 1]) == 1) {
            System.out.println(arr[0] + " is greater than " + arr[arr.length - 1]);
        } else if (compare(arr[0], arr[arr.length - 1]) == 0) {
            System.out.println("equal");

        } else {
            System.out.println(arr[0] + " is less than " + arr[arr.length - 1]);

        }

    }
}
