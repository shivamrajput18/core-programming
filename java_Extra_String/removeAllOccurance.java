package java_Extra_String;

public class removeAllOccurance {
    public static String charRemove(String text, char ch){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)!=ch ){
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="hello world";

        System.out.println("Modified word: " + charRemove(str, 'l'));
    }
        
}
