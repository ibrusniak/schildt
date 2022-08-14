import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class MapInterfaceDemo4 {
    
    public static void main(String[] args) {
        
        HashMap<Integer, Optional<Integer>> map = new HashMap<>();
        map.put(1, Optional.of(100));
        map.put(2, Optional.of(200));
        System.out.println(map);
        
        Map.Entry<Integer,Optional<Integer>> entry
            = Map.entry(300, Optional.of(300));
        System.out.println(entry);
        
        map.put(entry.getKey(), entry.getValue());
        System.out.println(map);

        map.forEach(new BiConsumer<Integer, Optional<Integer>>() {
            @Override
            public void accept(Integer k, Optional<Integer> u) {
                map.put(k, Optional.<Integer>of(u.get() - 50));
            }
        });
        System.out.println(map);

        map.forEach((k, v) -> map.put(k, null));
        System.out.println(map);

        System.out.println("1. is empty?: " + map.isEmpty());
        map.clear();
        System.out.println("2. is empty?: " + map.isEmpty());
    }
}


