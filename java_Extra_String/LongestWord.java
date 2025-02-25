package java_Extra_String;

import java.util.Scanner;

public class LongestWord {
    // Method to find the longest word in text
    public static String longestWord(String text){
        String[] words = text.split(" ");
        int idx = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<words.length; i++){
            if(max < words.length){
                idx = i;
                max = words[i].length();
            }
        }
        return words[idx];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();

        String ans = longestWord(text);
        
        System.out.println(ans);
        sc.close();

    }
}
