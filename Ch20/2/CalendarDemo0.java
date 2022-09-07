import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

public class CalendarDemo0 {

    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        Locale[] locales = Calendar.getAvailableLocales();
        Set<String> calendarTypes = Calendar.getAvailableCalendarTypes();

        System.out.println("\n\n" + calendar + "\n\n");

        int counter = 0;
        for (Locale l : locales) {
            System.out.print(l + " ");
            counter++;
            if (counter == 6) {
                System.out.println();
                counter = 0;
            }
        }

        System.out.println("\n");

        calendarTypes.stream()
            .forEach(System.out::println);

        System.out.println("\n" + calendar.getTimeZone() + "\n");
    }    
}

