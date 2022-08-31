import java.util.Calendar;

public class CalendarDemo2 {

    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        printCalendar(calendar);
        calendar.set(2022, 8, 31, 8, 50, 33);
        printCalendar(calendar);
        System.out.println("\n\n" + calendar);
    }

    private static void printCalendar(Calendar calendar) {

        System.out.println(String.format("%s-%s-%s %s:%s:%s",
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH),
            calendar.get(Calendar.HOUR),
            calendar.get(Calendar.MINUTE),
            calendar.get(Calendar.SECOND)
        ));
    }
}

