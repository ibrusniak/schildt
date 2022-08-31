import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class CalendarDemo0 {
    
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();

        StringTokenizer tokenizer = new StringTokenizer(calendar.toString(), ", ");
        
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        System.out.println();
        
        System.out.println(calendar.toInstant());
        System.out.println(calendar.getTimeZone());

        System.out.println();

        String[] availableIds = TimeZone.getAvailableIDs();

        Iterator it = Arrays.asList(availableIds).iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

