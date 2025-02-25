package java_Extra_String;

public class MostFrequentCharacter {

    public static char mostFreqChar(String str){
        int max = Integer.MIN_VALUE;
        char ans = ' ';
        
        for(int i=0; i<str.length(); i++){
            int count=0;
            char ch = str.charAt(i);
            for(int j=0; j<str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                    if(max <count){
                        ans = str.charAt(i);
                    }
                    
                }
            }
            max = Math.max(max, count);
        }

        return ans;
    }



    public static void main(String[] args) {
        String str = "success";

        
        System.out.println("Most Frequent Char: "+"'"+mostFreqChar(str)+"'");

    }
}
