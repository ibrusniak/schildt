import java.util.ArrayList;
import java.util.Collection;

/**
 * CollectionInterfaceMethods1. Demonstrates all methods
 * of the interface java.util.Collection. Collection interface
 * is the top of all Java Collection Framework.
 */
public class CollectionDemo1 {

    public static void main(String[] args) {
        
        if (args.length > 0) {
            try {                
                int n = Integer.valueOf(args[0]).intValue();
                switch (n) {
                    case 1: showDemo1();
                    case 2: showDemo2();
                }
            } catch (Exception e) {
                printUsage();
            }
        } else {
            printUsage();
        }
    }
    
    private static void printUsage() {
        log("Syntax: java CollectionDemo1 N, where N - number of the demo (1, 2, ...)");
    }

    @SuppressWarnings("unchecked")
    private static void showDemo1() {

        log("Adding element to the collection");

        Collection c1 = new ArrayList();
        
        log(c1);

        c1.add(new Object());
        c1.add(200);
        c1.add(3.4);
        c1.add(true);

        log(c1);

        Collection c2 = new ArrayList();
        
        c2.add(40);
        c2.add("String 1");
        c2.add("String 2");

        log(c2);

        c1.addAll(c2);

        log(c1);

        Collection<Float> c3 = new ArrayList<>();

        c3.add(2.2f);
        c3.add(0.65f);

        // boolean addAll(Collection<? extends E> c)
        // Float extends Object so it works properly
        c1.addAll(c3);

        log(c3);
        log(c1);
    }

    private static void showDemo2() {

    }

    private static <T> void log(T v) {
        System.out.println(v);
    }
}

