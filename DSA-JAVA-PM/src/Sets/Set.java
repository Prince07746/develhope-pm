package Sets;
import java.util.LinkedHashSet;
import java.util.HashSet;


public class Set {
    public static void main(String[] args){


        java.util.Set<String> week = new HashSet<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
        System.out.println("\t Week Hash Set: "+week);

        java.util.Set<String> week2 = new LinkedHashSet<>();
        week2.add("Monday");
        week2.add("Tuesday");
        week2.add("Wednesday");
        week2.add("Thursday");
        week2.add("Friday");
        week2.add("Saturday");
        week2.add("Sunday");
        System.out.println("\t Week linked Hash Set: "+week2);

        boolean equal = week.equals(week2);

        System.out.println("\t is week equal to week2: "+ equal);

    }
}


