import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        
        // A collection that contains no duplicate elements.
        // As implied by its name, this interface models
        // the mathematical set abstraction.

        Set<Integer> set1 = new HashSet<>();

        set1.add(20);
        set1.add(30);
        set1.add(20);

        println(set1); // [20, 30]
        set1.add(null);
        set1.add(null);
        println(set1); // [null, 20, 30]
        
        List<Integer> list1 = List.of(20, 20, 30, 10, 5, 0, 0);
        println(list1);

        Set<Integer> set2 = Set.copyOf(list1);
        println(set2);
    }

    private static <T> void println(T obj) {
        System.out.println(obj);
    }
}