import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarDemo0 {
    
    public static void main(String[] args) {
        
        GregorianCalendar calendar
            = new GregorianCalendar(2022, 7, 31, 9, 20, 00);

        System.out.println(calendar.toInstant());

        printCalendar(calendar);
        printCalendar(Calendar.getInstance());
        Calendar instance = Calendar.getInstance();
        instance.clear();
        printCalendar(instance); // January 1970-01-01 00:00:00

        System.out.println();

        TimeZone tz = TimeZone.getDefault();
        System.out.println(tz.getID());
    }
    
    private static void printCalendar(Calendar calendar) {
        System.out.println(
            String.format("%1$tB %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", calendar));
    }
}

