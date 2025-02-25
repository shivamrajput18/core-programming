import java.util.Scanner;

public class LowerCaseConversion {
    public static String convertToLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90)
                ch += 32;
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String manualUpper = convertToLowerCase(str);
        String builtInUpper = str.toLowerCase();
        System.out.println("Manual LowerCase: " + manualUpper);
        System.out.println("Built-in LowerCase: " + builtInUpper);
        System.out.println("Both methods give the same result: " + compareStrings(manualUpper, builtInUpper));
        sc.close();
    }
}
