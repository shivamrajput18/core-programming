public class KmToMilesConverter {
    public static double convertToMiles(double kilometers) {
        double conversionFactor = 1.6;
        return kilometers / conversionFactor;
    }

    public static void main(String[] args) {
        double kilometers = 10.8;

        double miles = convertToMiles(kilometers);
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}