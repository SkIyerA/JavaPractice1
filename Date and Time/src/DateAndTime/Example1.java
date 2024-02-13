package DateAndTime;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Example1 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date:"+currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " +currentTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String FormattedDateTime = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println(FormattedDateTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        String time =  "15:30:00";
        LocalTime parsedTime = LocalTime.parse(time);
        System.out.println(parsedTime);

        String dateTime = "2022-01-16 15:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTime,dateTimeFormatter);
        System.out.println(parsedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);


        LocalTime startTime = LocalTime.of(12,0);
        LocalTime endTime = LocalTime.of(18,0);
        Duration duration =Duration.between(startTime,endTime);
        System.out.println(duration);
        



    }
}
