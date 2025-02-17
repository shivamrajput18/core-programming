import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = scanner.nextInt();

        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();

        String youngestFriend;
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));

        if (minAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (minAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        String tallestFriend;
        int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        if (maxHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (maxHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngestFriend + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + maxHeight + " cm)");

        scanner.close();
    }
}
