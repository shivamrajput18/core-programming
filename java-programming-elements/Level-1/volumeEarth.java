public class volumeEarth {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double kmToMiles = 0.621371;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f\n",
                          volumeKm3, volumeMiles3);
    }
}