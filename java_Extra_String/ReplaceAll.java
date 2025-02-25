package java_Extra_String;

public class ReplaceAll {
    // Method to replace the word to given word
    public static String replace(String text, String str1, String str2) {
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].equals(str1)) {
                textArray[i] = str2;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < textArray.length; i++) {
            sb.append(textArray[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "hi bro my name ";
        String str1 = "bro";
        String str2 = "chill";

        System.out.println(replace(text, str1, str2));

    }
}
