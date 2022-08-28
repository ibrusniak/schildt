import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo1 {

    public static void main(String[] args) {

        Map<Integer, String> map1
            = Map.of(3, "D", 9, "A", 2, "F");
        
        HashMap<Integer, String> map2 = new HashMap<>(map1);
        TreeMap<Integer, String> map3 = new TreeMap<>(map1);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3); // Ordered keys

        TreeMap<Integer, String> map4 =
            new TreeMap<>(Integer::compare);

        TreeMap<Integer, String> map5 =
            new TreeMap<>((o1, o2) -> 1); // Insert order
        
        map5.put(10, "F");
        map5.put(1, "C");
        map5.put(3, "D");

        System.out.println(map5);
    }
}

