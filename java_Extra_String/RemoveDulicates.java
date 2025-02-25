package java_Extra_String;

public class RemoveDulicates {

    public static String removeDulicate(String str){
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<str.length(); i++){
            boolean isunique = true;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    isunique = false;
                    break;
                }
            }

            if(isunique){
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "better";

        System.out.println(removeDulicate(str));



    }   
}
