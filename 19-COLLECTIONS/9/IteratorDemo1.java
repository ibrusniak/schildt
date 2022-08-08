
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class IteratorDemo1 {
    
    public static void main(String[] args) {

        //  If you won’t be modifying the contents of a collection
        // or obtaining elements in reverse order, then the
        // for-each version of the for loop is often a more
        // convenient alternative to cycling through a collection
        // than is using an iterator.

        TreeSet<String> sset = new TreeSet<>();
        sset.add("A");
        sset.add("C");
        sset.add("F");
        sset.add("A");
        sset.add("B");

        System.out.println(sset);

        Iterator<String> it = sset.iterator();

        it.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.print(t + " ");
            }
        });

        it = sset.iterator();
        System.out.println();
        it.forEachRemaining(IteratorDemo1::pr);
        
        System.out.println();
        // Use for enstead of iterator
        for (String string : sset) {
            pr(string);
        }
        System.out.println();
    }

    public static void pr(Object o) {
        System.out.print(o + " ");
    }
}


