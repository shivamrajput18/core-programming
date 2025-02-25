package java_Strings.Level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0'; // Return null character if all characters are repeating
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");

        String text = sc.nextLine();

        char result = findFirstNonRepeatingCharacter(text);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("All characters are repeating.");
        }

        sc.close();
    }

}
