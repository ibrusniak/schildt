import java.util.EnumSet;
import java.util.Iterator;

public class IteratorDemo {

    public enum letter {
        A, B, C, D, E,  F
    }

    public static void main(String[] args) {
        
        EnumSet eset1 = EnumSet.allOf(letter.class);

        Iterator iterator = eset1.iterator();
        while (iterator.hasNext()) {
            println(iterator.next() + " ");
        }
        println();
        println();
        try {
            println(iterator.next());
        } catch (Exception e) {
            println("iterator has reached last element! " + e);
        }
        
        iterator = eset1.iterator();
        iterator.forEachRemaining(IteratorDemo::print);
        println();

        iterator = eset1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        println(eset1);
    }

    public static <E> void println(E o) {
        System.out.println(o);
    }

    public static <E> void print(E o) {
        System.out.print(o + " ");
    }

    private static void println() {
        System.out.println();
    }
}

