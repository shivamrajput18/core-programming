package Built_in_Methods;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        StringBuilder filtered = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        
        int left = 0, right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}
