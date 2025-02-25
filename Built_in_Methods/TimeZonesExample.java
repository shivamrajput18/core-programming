package Built_in_Methods;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesExample {
    
    public static void main(String[] args) {
        // Define the required time zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata"); // IST
        ZoneId pstZone = ZoneId.of("America/Los_Angeles"); // PST

        // Get the current time in the different zones
        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
        ZonedDateTime istTime = ZonedDateTime.now(istZone);
        ZonedDateTime pstTime = ZonedDateTime.now(pstZone);

        // Define a formatter to display the date and time properly
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Print the times
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
