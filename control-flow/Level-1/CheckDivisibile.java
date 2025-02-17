import java.util.*;

public class CheckDivisibile {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number : ");
    int num = sc.nextInt();
    if(num % 5 == 0){
        System.out.println("Number " + num + " is divisible by 5");
    }
    else{
        System.out.println("Number " + num + " is  not divisible by 5");
    }
   } 
}
