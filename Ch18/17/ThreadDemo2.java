import java.io.PrintStream;
import java.util.HashMap;

public class ThreadDemo2 {
    
    public static void main(String[] args) {

        // this code is running in the "default" thread ("main")

        // All the java.lang.Thread static methods:
        
        Object object = new Object();

        System.out.printf("""

                Thread static methods:
                active count:               %20d
                current thread:             %20s
                holds lock on the 'object': %20b
                interrupted:                %20b

                """,
            Thread.activeCount(),
            Thread.currentThread(),
            Thread.holdsLock(object),
            Thread.interrupted());

        Thread.dumpStack();

        System.out.println();
    }
}

