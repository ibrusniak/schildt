import static utils.Printers.*;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    
    public static void main(String[] args) {

        // A SortedSet extended with navigation methods reporting
        // closest matches for given search targets.

        // Methods lower(E), floor(E), ceiling(E), and higher(E) return
        // elements respectively less than, less than or equal, greater than or equal,
        // and greater than a given element, returning null if there is no such
        // element.

        NavigableSet<Integer> nset1
            = new TreeSet<>();
        
        nset1.add(1);
        nset1.add(5);
        nset1.add(-1);
        nset1.add(9);
        nset1.add(0);
        nset1.add(1);
        nset1.add(-2);

        println(nset1); // [-2, -1, 0, 1, 5, 9]

        println(nset1.lower(3)); // 1
        println(nset1.floor(3)); // 1
        
        println(nset1.lower(5)); // 1
        println(nset1.floor(5)); // 5

        println(nset1.ceiling(5)); // 5
        println(nset1.higher(5)); // 9

        NavigableSet<Integer> nset2
            = nset1.subSet(0, true, 5, true);
        
        println(nset2);
    }
}


