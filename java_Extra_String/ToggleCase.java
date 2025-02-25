package java_Extra_String;

import java.util.Scanner;

public class ToggleCase {
    // Method to Toggel each character 
    public static String toogleCase(String str){
        String res = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                res += Character.toLowerCase(ch);
            }else{
                res += Character.toUpperCase(ch);
            }
        }
        return res;
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = sc.nextLine();

        System.out.println(toogleCase(inputString));

        sc.close();
    }
}
