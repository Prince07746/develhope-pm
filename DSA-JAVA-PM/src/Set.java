import java.util.LinkedHashSet;
import java.util.HashSet;


public class Set {
    public static void main(String[] args){


        HashSet<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println("\t Week Hash Set: "+days);

        LinkedHashSet<String> orderedDays = new LinkedHashSet<>();
        orderedDays.add("Monday");
        orderedDays.add("Tuesday");
        orderedDays.add("Wednesday");
        orderedDays.add("Thursday");
        orderedDays.add("Friday");
        orderedDays.add("Saturday");
        orderedDays.add("Sunday");
        System.out.println("\t Week linked Hash Set: "+orderedDays);

        boolean equal = orderedDays.equals(days);
        if(equal){
            System.out.println("\t is week is equal to week2 ");
        }else{
            System.out.println("\t is week is not equal to week2 ");
        }


    }
}


