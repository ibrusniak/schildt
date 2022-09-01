import java.util.Arrays;
import java.util.TimeZone;

public class TimeZoneDemo0 {
    
    public static void main(String[] args) {
        
        TimeZone tz = TimeZone.getDefault();
        System.out.println(tz.getClass().getName());
        System.out.println(tz.getRawOffset());
        
        System.out.println();
        String[] availableDS = tz.getAvailableIDs();
        
        Arrays.asList(availableDS).forEach(x -> System.out.print(x + " "));
        
        System.out.println("\n");
        
        tz.setID("Etc/Zulu");
        System.out.println(tz.getRawOffset());
    }
}
