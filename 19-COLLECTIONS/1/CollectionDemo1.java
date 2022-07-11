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

    private static void showDemo1() {

        log("Adding element to the collection");

        Collection c = new ArrayList();
        
        c.add(new Object());
        c.add(200);
        c.add(3.4);
        c.add(true);

        log(c);
    }

    private static void showDemo2() {

    }

    private static <T> void log(T v) {
        System.out.println(v);
    }
}

