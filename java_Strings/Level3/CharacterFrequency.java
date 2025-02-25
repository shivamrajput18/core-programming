package java_Strings.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    public static String[] findFrequency(String text) {
        // Create an array to store the frequency of each character
        int[] freq = new int[text.length()];
        char[] chars = text.toCharArray();

        // Outer loop to iterate through each character in the text
        for (int i = 0; i < text.length(); i++) {
            freq[i] = 1;
            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < text.length(); j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    // Set the duplicate characters to '0' to avoid counting them again
                    chars[j] = '0';
                }
            }
        }

        // Create a 1D String array to store the characters and their frequencies
        String[] result = new String[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " - " + freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        String[] frequencyResult = findFrequency(text);

        System.out.println("Character Frequencies:");
        for (String freq : frequencyResult) {
            if (freq != null) {
                System.out.println(freq);
            }
        }

        scanner.close();
    }
}
