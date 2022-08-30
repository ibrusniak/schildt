import java.util.Iterator;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo0 {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        // Vector implements a dynamic array. It is similar to
        // ArrayList, but with two differences: Vector is synchronized, and
        // it contains many legacy methods that duplicate the functionality of
        // methods defined by the Collections Framework.

        Vector v1 = new Vector<>();
        v1.add(10);
        v1.add(2.3);
        v1.add("str");
        
        Iterator it = v1.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Vector<String> v2 = new Vector<>(v1);
        System.out.println(v2);
        for (Object o : v2) {
            System.out.println(o.getClass().getName());
        }
        // v2.add(new Object()); // Compilation error
        v2.add("One");
        System.out.println(v2);

        Vector<Integer> v3 = new Vector<>();
        System.out.println();
        System.out.println(v3.capacity()); // 10 like any collectio
        System.out.println(v3.size()); // 0

        v3.add(1); // From Collection interface
        v3.add(2);
        v3.add(3);
        v3.add(4);
        v3.addElement(5); // legacy

        Enumeration<Integer> en = v3.elements(); // like Iterator

        System.out.println();
        while (en.hasMoreElements()) {
            System.out.print(" " + en.nextElement());
        }

        System.out.println();

        // reverse comparator
        v3.sort((a, b) -> {
            if (a > b) return -1;
            if (a < b) return 1;
            return 0;
        });

        System.out.println(v3);
    }
}
