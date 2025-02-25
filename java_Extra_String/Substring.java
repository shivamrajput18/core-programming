package java_Extra_String;

import java.util.Scanner;

public class Substring {
    public static int countSubstring(String text, String substr){
        int idx =0;
        int count =0;
        while((idx = text.indexOf(substr, idx))!= -1){
            count++;
            idx += substr.length();
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text");
        String str = sc.nextLine();
        System.out.println("Enter the Substring to extract the count");
        String substr = sc.nextLine();
        
        int count = countSubstring(str, substr);

        System.out.println("count of the word: "+count);
        sc.close();
    }
}
