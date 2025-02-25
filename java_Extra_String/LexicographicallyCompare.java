package java_Extra_String;

import java.util.Scanner;

public class LexicographicallyCompare {
    //Method to return the sting in lexicographical order
    public static void compareLexicographically(String str1, String str2) {
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                continue;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2);
                break;
            } else {
                System.out.println(str2 + " comes before " + str1);
                break;
            }
        }

        if (str1.length() > str2.length()) {
            System.out.println(str2 + " comes before " + str1);

        } else if (str1.length() < str2.length()) {
            System.out.println(str1 + " comes before " + str2);

        } else {
            System.out.println("Both string is equal");

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = sc.nextLine();
        System.out.println("Enter the second word");
        String word2 = sc.nextLine();

        compareLexicographically(word1, word2);
        sc.close();
    }
}
