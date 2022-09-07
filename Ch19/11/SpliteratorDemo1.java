
import java.util.Spliterator;
import java.util.List;
import java.util.ArrayList;

public class SpliteratorDemo1 {
    
    public static void main(String[] args) {

        var letters = new ArrayList<String>();
        
        addAll(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "k", "l"},
            letters);
        
        cout(letters);

        var spliterator = letters.spliterator();
        cout(spliterator);
        var characteristics = spliterator.characteristics();
        var flags = Integer.toBinaryString(characteristics);
        cout("characteristics: " + flags);
        
        cout("letters size: " + letters.size());
        cout("astimated size: " + spliterator.estimateSize());

        // default Complarator<? super T> getComparator()
        // Returns the comparator osed by the invoking
        // spliterator or null if natural ordering is used.
        // If the sequence is unordered, IllegalStateException
        // is thrown
        try {
            cout("comparator: " + spliterator.getComparator());
        } catch (Exception e) {
            cout(e);
        }

        System.out.println();

        while(spliterator.tryAdvance(SpliteratorDemo1::print));

        System.out.println("\n\n");

        var sp1 = letters.spliterator();
        var sp2 = sp1.trySplit();

        while(sp1.tryAdvance(SpliteratorDemo1::print));
        System.out.println();
        while(sp2.tryAdvance(SpliteratorDemo1::print));
    }

    private static <T> void cout(T object) {
        System.out.println(object);
    }

    private static <T> void print(T object) {
        System.out.print(object + " ");
    }

    /**
     * Generics are a powerful thing!
     */
    private static <E, T extends List<E>> void addAll(E[] array, T collection) {
        for (E element : array)
            collection.add(element);
    }
}

