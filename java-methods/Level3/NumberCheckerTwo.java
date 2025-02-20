// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// Hint => 
// Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
// Method to find the sum of the digits of a number using the digits array
// Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
// Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
// Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
// Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
// Method to reverse the digits array 
// Method to compare two arrays and check if they are equal
// Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 


import java.util.Scanner;

public class NumberCheckerTwo {

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;

    }

    public static int[] storeDigits(int number) {

        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++){
            digits[i] = numStr.charAt(i) -'0';

        }
        return digits;
    }

    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isDuckNumber(int number) {
        return String.valueOf(number).contains("0");
    }

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int  temp = number;
        int digits = countDigits(number);
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }

    public static boolean isHarshadNumber(int[] digits) {
        int sum = findSumOfDigits(digits);
        return sum != 0 && sum % findSumOfDigits(digits) == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest)
                secondLargest = digit;
        }
        return new int[] { largest, secondLargest };
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] digits = storeDigits(number);
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Largest and second largest digits: " + java.util.Arrays.toString(findLargestAndSecondLargest(digits)));
        System.out.println("Sum of digits: " + findSumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + findSumOfSquares(digits));
        System.out.println("Is a Duck number: " + isDuckNumber(number));
        System.out.println("Is an Armstrong number: " + isArmstrong(number));
        System.out.println("Is a Harshad number: " + isHarshadNumber(digits));
        System.out.println("Digit frequency: ");
        int[][] frequency = findDigitFrequency(digits);
        for (int[] freq : frequency) {
            System.out.println(freq[0] + " : " + freq[1]);
        }

        




    }
}
