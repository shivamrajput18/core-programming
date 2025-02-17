import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks for Mathematics: ");
        int maths = scanner.nextInt();

        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0; 

        String grade, remarks;

        if (percentage >= 80) {
            grade = "A+";
            remarks = "(Level 4 , above agency-normalized standards)";
        }      
        else if (percentage >= 70) {
            grade = "B+";
            remarks = "(Level 3 , at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "(Level 2 , below , but approaching agency-normalized standards )";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized)";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "(Level 1- , too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
