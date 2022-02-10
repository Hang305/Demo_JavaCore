package Lesson14_TopicAdvanded.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {


    public static void main(String[] args) {

        //Get date
        LocalDate date = LocalDate.now();

        System.out.println(date);

        //Get time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Get datetime
        LocalDateTime datetime = LocalDateTime.of(date, time);
        //Or
        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println(datetime);
        System.out.println(datetime1);

        //Get datetime by format
        DateTimeFormatter datetimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String myFormatter = datetime1.format(datetimeFormatter);
        System.out.println(myFormatter);
    }
}
