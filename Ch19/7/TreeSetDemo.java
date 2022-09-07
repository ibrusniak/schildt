import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Collection;

public class TreeSetDemo {
    
    public static void main(String[] args) {

        ArrayList<Integer> source = new ArrayList<>();
        addAll(source, -2, 0, -6, 0, 2, 6, 2, 5, 9);
        HashSet<Integer> hashSet = new HashSet<>(source);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(source);
        TreeSet<Integer> treeSet = new TreeSet<>(source);

        printAll("source (ArrayList): " + source);
        printAll("HashSet (shuffled): " + hashSet);
        printAll("LinkedHashSet (as original) : " + linkedHashSet);
        printAll("TreeSet: (ordered by ascending) " + treeSet);

        // Objects are stored in sorted,
        // ascending order. Access and retrieval times are quite fast, which makes
        // TreeSet an excellent choice when storing large amounts of sorted information
        // that must be found quickly.

        printAll(treeSet.subSet(0, 6));
    }

    private static void printAll(Object... args) {
        for (Object arg : args)
            System.out.println(arg);
    }

    @SuppressWarnings("unchecked")
    private static <E> void addAll(Collection<E> collection, E... objects) {
        
        for (E o : objects) {
            collection.add(o);
        }
    };
}


