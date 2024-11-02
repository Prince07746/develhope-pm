package DateTime;

import java.time.*;

public class DateTime {
    public static void main(String[] args){

        System.out.println("Date time");
        System.out.println(LocalDateTime.now());
        System.out.println("------------------------");
        System.out.println("Date");
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2024, Month.NOVEMBER,1));
        System.out.println("------------------------");
        System.out.println("time");
        System.out.println(LocalTime.now());
        System.out.println("------------------------");
        System.out.println("Zone time");
        System.out.println(ZonedDateTime.now());


    }
}
