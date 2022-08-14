import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class MapInterfaceDemo1 {

    public static void main(String[] args) {
        
        Map<Integer, String> source = Map.of(
            1, "One",
            2, "Two",
            3, "Three",
            4, "Four"
        );
    
        println(source);
        Map<Integer, String> map2 = new HashMap<>(source);
        println(map2);
        println();
        map2.put(2, "_Two");
        println(map2);
        map2.putIfAbsent(3, "_Three");
        println(map2.get(3));
        println("containsKey(10): " + map2.containsKey(10));
        println("containsKey(10): " + map2.containsKey(4));
        println();
        println("containsValue(\"Three\"): " + map2.containsValue("Three"));
        println("containsValue(\"Two\"): " + map2.containsValue("Two"));

        println();
        var entrySet = map2.entrySet();
        println(entrySet.getClass()); // java.util.HashMap$EntrySet
        println(entrySet);
        LinkedHashSet<Map.Entry<Integer, String>>
            set = new LinkedHashSet<>(entrySet);
        
        println();
        println(set);
        Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) set.toArray()[0];
        println(entry.getClass());
        println(entry.getKey());
        println(entry.getValue());
    }

    private static <T> void println(T o) {
        System.out.println(o);
    }

    private static void println() {
        System.out.println();
    }
}