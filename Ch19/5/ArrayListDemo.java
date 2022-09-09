import java.util.AbstractList;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
        // ArrayList supports dynamic arrays that can grow as needed.

        List<Integer> arrayList1 = new ArrayList<>();
        AbstractList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        Collections.addAll(arrayList1, 2, 3, 4, 5);
        Collections.addAll(arrayList2, 6, 7, 8, 9);
        Collections.addAll(arrayList3, 10, 11, 12, 13);

        println(arrayList1);
        println(arrayList2);
        println(arrayList3);

        println("");

        ArrayList l1 = new ArrayList<>();
        println(l1.size());

        l1 = new ArrayList<>(25);
        println(l1.size());

        l1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        println(l1.size());
        println(l1);

        Object[] array = l1.toArray();
        for (Object o : array)
            System.out.print(o + " ");
        println("");

        l1.add(null);
        l1.add(null);

        println(l1);
    }

    private static void println(Object o) {
        System.out.println(o);
    }
}
