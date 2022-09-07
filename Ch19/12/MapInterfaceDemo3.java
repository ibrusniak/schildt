import java.util.HashMap;
import java.util.Optional;
import java.util.function.BiFunction;

public class MapInterfaceDemo3 {

    public static void main(String[] args) {
        
        HashMap<Integer, Optional<Integer>> map = new HashMap<>();
        map.put(1, Optional.of(200));
        map.put(2, Optional.of(300));
        map.put(3, Optional.of(400));
        System.out.println(map);

        BiFunction<Integer, Optional<Integer>, Optional<Integer>> biFunctionPlus500
            = (k, v) -> v = Optional.of(v.get() + 500);

        BiFunction<Integer, Optional<Integer>, Optional<Integer>> biFunctionMinus100
            = (k, v) -> v = Optional.of(v.get() - 100);
        
        map.compute(Integer.valueOf(2), biFunctionPlus500);
        map.compute(Integer.valueOf(3), biFunctionMinus100);
        System.out.println(map);
    }
}
