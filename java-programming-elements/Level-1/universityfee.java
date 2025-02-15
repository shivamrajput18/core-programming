import java.util.Scanner; 

public class universityfee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double payableFee = fee - discount;

        System.out.printf("The discount is %.2f, and the fee you have to pay is %.2f\n", discount, payableFee);

    }
}