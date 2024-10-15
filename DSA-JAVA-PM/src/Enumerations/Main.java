package Enumerations;

public class Main {
    // Define the enumeration with all the months
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        // Iterate  the values of the Month enum
        for (Month month : Month.values()) {
            // Check if the name of the month ends with 'Y'
            if (month.name().endsWith("Y")) {
                System.out.println(month.name() + " ends with y");
            } else {
                System.out.println(month.name() + " doesn't end with y");
            }
        }
    }
}
