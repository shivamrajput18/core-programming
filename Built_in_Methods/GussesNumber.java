package Built_in_Methods;

import java.util.Scanner;

public class GussesNumber {

    public static int generateRandomNumder() {
        int rand = (int) (Math.random() * 100);
        return rand;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusee The Number");
        int randomNum = generateRandomNumder();
        int lives =5;
        while(lives!=0){
            int n = sc.nextInt();
            if(n>randomNum){
                System.out.println("Your number is greater\n Turn Left: " + (lives-1));
            }else if (n<randomNum){
                System.out.println("Your number is smaller\n Turn left: " + (lives-1));
                
            }else{
                System.out.println("Your won");
                break;
            }
            lives--;
            
        }

        if(lives==0){
            System.out.println("Game over ! u loose" + randomNum);
        }

    }
}
