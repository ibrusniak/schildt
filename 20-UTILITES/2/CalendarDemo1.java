import java.util.Calendar;

public class CalendarDemo1 {

    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        System.out.println(calendar.toInstant());

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

        System.out.println("\n");

        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println(String.format("%s-%s-%s %s:%s:%s",
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DATE),
            calendar.get(Calendar.HOUR),
            calendar.get(Calendar.MINUTE),
            calendar.get(Calendar.SECOND)
        ));
    }
}
