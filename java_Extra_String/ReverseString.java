package java_Extra_String;

public class ReverseString {

    public static String reverse(String s){
        String str = "";
        for(int i=0; i<s.length(); i++){
            str = s.charAt(i) + str;
        }
        return str;
    }

    public static void main(String[] args) {
        String text = "Hello";

        System.out.println(reverse(text));
    }
}
