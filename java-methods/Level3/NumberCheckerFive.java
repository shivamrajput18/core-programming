// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// Hint => 
// Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
// Method to find the greates factor of a Number using the factors array
// Method to find the sum of the factors using factors array and return the sum
// Method to find the product of the factors using factors array and return the product
// Method to find product of cube of the factors using the factors array. Use Math.pow() 
// Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
// Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
// Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
// Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself

import java.util.Scanner;

public class NumberCheckerFive {

    public static int[] findFactors(int number) {
        int[] factors = new int[number];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }


    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            if(factor == 0) {
                break;
            }
            product *= factor;
        }
        return product;
    }

    public static int findProductOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            if(factor == 0) {
                break;
            }
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum == 2 * number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum > 2 * number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum < 2 * number;
    }

    public static boolean isStrongNumber(int number) {
        int[] digits = NumberChecker.storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += findFactorial(digit);
        }
        return sum == number;
    }

    public static int findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
        


    }
}
