import java.util.*;

public class averageMarks {
    public static double calculateAverage(int maths, int physics, int chemistry) {
        return (maths + physics + chemistry) / 3.0;
    }

    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = calculateAverage(maths, physics, chemistry);

        System.out.println("Sam's average mark in PCM is " + average + "%");
    }
}