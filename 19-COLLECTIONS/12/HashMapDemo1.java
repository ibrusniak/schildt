import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    
    public static void main(String[] args) {
        
        // You should note that a hash map does not guarantee
        // the order of its elements.

        String[] dayNames = new String[] {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        HashMap<Integer, String> daysMap
            = new HashMap<>();
        
        for (int i = dayNames.length - 1; i >= 0; i--) {
            daysMap.put(i+1, dayNames[i]);
        }
        
        // keys - ascending order
        daysMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(daysMap);
        
        System.out.println();
        
        daysMap.clear();
        
        for (int i = 0; i < dayNames.length; i++) {
            daysMap.put(i+1, dayNames[i]);
        }
        // keys - ascending order
        daysMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(daysMap);

        System.out.println(daysMap.size()); // 7

        Set<Map.Entry<Integer, String>> daysSet = daysMap.entrySet();
        System.out.println(daysMap.getClass());
        System.out.println(daysSet.getClass());
        System.out.println();
        for (Map.Entry<Integer, String> entry : daysSet) {
            System.out.println(entry);
        }
    }
}
