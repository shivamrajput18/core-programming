import java.util.Scanner;

public class StringEquals {

    public static boolean customEquals(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string 1");
        String str1 = sc.next();
        System.out.println("Enter the string 1");
        String str2 = sc.next();

        System.out.println("Custom Equals: "+customEquals(str1,str2));

        System.out.println("In built equals: "+str1.equals(str2));
    }
}
