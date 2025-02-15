import java.util.*;

public class QuoitentReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Take First Number : ");
        int first = sc.nextInt();
        System.out.print("Take Second Number : ");
        int second = sc.nextInt();

        int quoitent;
        int reminder;
        if(first > second){
            if (second == 0) {
                System.out.println("Division by zero is not allowed.");
            } 
            quoitent = first / second;
            reminder = first % second;
            
        }
        else{
            if (first == 0) {
                System.out.println("Division by zero is not allowed.");
            } 
            quoitent = second / first;
            reminder = second % first;
        }
        
        System.out.println("The Quotient is  " + quoitent + " and Reminder is  " + reminder + " of two numbers " + first + " and " + second );

    }
}
