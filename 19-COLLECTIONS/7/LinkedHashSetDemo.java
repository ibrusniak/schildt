import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class LinkedHashSetDemo {
    
    public static void main(String[] args) {
        
        // LinkedHashSet maintains a linked list of the entries in the set,
        // in the order in which they were inserted. This allows insertion-order
        // iteration over the set

        ArrayList<String> source = new ArrayList<>();

        source.add("Jack");
        source.add("Rudger");
        source.add("Jill");
        source.add("Michael");     

        HashSet<String> hashSet = new HashSet<>(source);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(source);

        prn(source, hashSet, linkedHashSet);

        source.sort((o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            if (o1.length() < o2.length()) return -1;
            return 0;
        });

        prn(source);

        // LinkedHashSet.sort... does not support
    }

    private static void prn(Object... args) {

        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}
