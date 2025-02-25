import java.util.Scanner;

public class ShortestAndLongestString {

    // Method to split the text into words without using split() method
    public static String[] splitText(String text) {
        // Count the number of words in the text
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else {
                words[index++] = word.toString();
                word = new StringBuilder();
            }
        }
        words[index] = word.toString();
        return words;
    }

    // Method to find the length of a string without using length() method
    public static int findLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to return a 2D String array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find the shortest and longest strings in a 2D array of words and lengths
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (int i = 1; i < wordLengths.length; i++) {
            if (Integer.parseInt(wordLengths[i][1]) < findLength(shortest)) {
                shortest = wordLengths[i][0];
            }
            if (Integer.parseInt(wordLengths[i][1]) > findLength(longest)) {
                longest = wordLengths[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        // Split the text into words
        String[] words = splitText(text);

        // Get words and their lengths in a 2D array
        String[][] wordLengths = getWordsAndLengths(words);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordLengths);

        // Display the result
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        scanner.close();
    }
}
