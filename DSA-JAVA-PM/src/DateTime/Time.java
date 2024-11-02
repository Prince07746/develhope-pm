package DateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class Time {
    public static void main(String[] args){


       while (true){
           LocalDateTime time =  LocalDate.now().atTime(LocalTime.now());
           System.out.println(time.getSecond());
       }


    }
}
