package java_Strings.Level3;

import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store the frequency of characters
        int[] freq = new int[256];

        // Find the frequency of characters in text1
        for (char c : text1.toCharArray()) {
            freq[c]++;
        }

        // Find the frequency of characters in text2
        for (char c : text2.toCharArray()) {
            freq[c]--;
        }

        // Compare the frequency of characters
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        
        scanner.close();
    }
}
