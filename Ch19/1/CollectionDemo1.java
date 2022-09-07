import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

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
                    case 3: showDemo3();
                    case 4: showDemo4();
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

        log("Checking if collection contains data");
        
        Collection<String> c1 = new LinkedList<>();
        Collection<String> c2 = new LinkedList<>();

        String str1 = "String 1";
        String str2 = "String 2";
        String str3 = "String 3";

        c1.add(str1);
        c1.add(str2);

        c2.addAll(c1);

        c1.add(str3);

        log(c1);
        log(c2);

        log("c1 contains str1? " + c1.contains(str1));
        log("c1 contains str2? " + c1.contains(str2));
        log("c2 contains str3? " + c2.contains(str3));

        log("c1 contains c2? " + c1.containsAll(c2));
        log("c2 contains c1? " + c2.containsAll(c1));

        log("c1 equals c2? " + c1.equals(c2));
        log("c1 equals c2? " + c1.equals(c1));
        
        Collection c3 = c1;
        log("c3 equals c1? " + c3.equals(c1));
        
        emptyLine();

        log("c3.hashCode(): " + c3.hashCode());
        c3.clear();
        log("c3.hashCode(): " + c3.hashCode());
        c2.clear();
        log("c2.hashCode(): " + c2.hashCode());

        // "equals" compares elements of two collections
        log("c3.equals(c2): " + c3.equals(c2));

        log("c1.size(): " + c1.size());
        log("c2.size(): " + c2.size());
        log("c3.size(): " + c3.size());
        
        c1.add("Strign 4");
        log("c1.size(): " + c1.size());
    }

    private static void showDemo3() {

        log("Another features of the Collection interface.");
        
        Collection<Integer> c1 = new ArrayList<>();

        c1.add(1); c1.add(2); c1.add(3);
        log(c1);
        c1.remove(2);
        log(c1);
        c1.add(4); c1.add(5); c1.add(6);
        log(c1);

        Collection<Integer> c2 = new ArrayList<>();
        c2.add(10); c2.add(1); c2.add(6);
        emptyLine();
        log(c1);
        log(c2);
        log("c1.removeAll(Collection<?> c) operation");
        c1.removeAll(c2);
        log(c1);
        
        emptyLine();
        c1.addAll(c2);
        log(c1);
        c1.removeIf(x -> x > 5);
        log("c1.removeIf(x -> x > 5) operation");
        log(c1);
        
        emptyLine();
        log(c1);
        log(c2);
        log("c1.retainAll(c2)");
        c1.retainAll(c2);
        log(c1);
    }

    private static void showDemo4() {

        log("Another features of the Collection interface.");
        
        Collection<Integer> intCollection = new ArrayList<>();
        Collections.addAll(intCollection, 1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> stream = intCollection.stream();
        stream.forEachOrdered(x->log(x));

        Object[] objArray = intCollection.toArray();
        emptyLine();
        for (Object obj : objArray) {
            System.out.print(obj + " ");
        }
        emptyLine();
        Integer[] intArray = intCollection.toArray(x -> new Integer[]{x});
        for (Integer i : intArray) {
            System.out.print(i + " ");
        }
        emptyLine();
    }

    private static void emptyLine() {
        System.out.println();
    }

    private static <T> void log(T v) {
        System.out.println(v);
    }
}

