import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.TooManyListenersException;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import java.lang.StackWalker.Option;
import java.util.ArrayList;
/**
 * CollectionDemo2. Demonstrates java.util.Collection
 * interface features.
 */
public class CollectionDemo2 {

    public static void main(String[] args) {
        
        // Collection declares the core methods that all
        // collection will have. All collections implement
        // java.util.Collection

        Collection<Integer> arrayList1 = new ArrayList<>();

        // boolean add(E obj) - adds obj to the invoking collection.
        // Returns true if obj was added to the collection. Returns
        // false if ogb is already a member of the collection and collection
        // does not allow duplicates.

        arrayList1.add(200);
        arrayList1.add(300);
        arrayList1.add(500);
        arrayList1.add(200); // Duplicates are allowed by the ArrayList
        toOutput(arrayList1); // [200, 300, 500, 200]

        Collection<Integer> hashSet1 = new HashSet<>();

        hashSet1.add(100);
        hashSet1.add(200);
        hashSet1.add(100); // Duplicates are not allowed by the HashSet
        toOutput(hashSet1); // [100, 200]

        // java.util.HashMap is not from Collection hierarchy.
        // So it has its own way to add "elements" - method "put"
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Key1", 200);
        hashMap1.put("Key2", 200);
        hashMap1.put("Key1", 200);
        toOutput(hashMap1); // {Key2=200, Key1=200}

        // boolean addAll(Collection<? extends E> c)
        // Adds ass the elements of c to the invoking collection.
        // Returns true if the collection changed (i.e., the elements
        // were added). Otherwise, returns false)
        Collection<String> arrayList2 = new ArrayList<>();
        arrayList2.add("String 1");
        arrayList2.add("String 2");
        arrayList2.add("String 3");
        toOutput(arrayList2); // [String 1, String 2, String 3]
        Collection<String> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList2);
        toOutput(arrayList3); // [String 1, String 2, String 3]

        // void clear()
        // Removes all elements from the invoking collection.
        arrayList3.clear();
        toOutput(arrayList3); // []

        // boolean contains(Object obj)
        // Return true if obj is an element of the invoking
        // collection. Otherwise, return false.
        Collection<Double> arrayList4 = new ArrayList<>();
        arrayList4.add(3.3);
        arrayList4.add(3.4);
        arrayList4.add(3.5);
        arrayList4.add(3.6);
        Double doubleValue = 3.6;
        toOutput(arrayList4);
        toOutput(doubleValue);
        toOutput("arrayList4 contains doubleValue: "
            + arrayList4.contains(doubleValue));
        
        // boolean containsAll(Collection<?> c)
        // Returns true if the invoking collection contains all
        // elements of c. Otherwise, return false.
        arrayList1.clear();
        arrayList2.clear();

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        toOutput(arrayList1);

        arrayList2.add("string 1");
        arrayList2.add("string 2");
        arrayList2.add("string 3");
        toOutput(arrayList2);

        toOutput("arrayList1 contains all from arrayList2: "
            + arrayList1.containsAll(arrayList2));
        
        Collection<Integer> arrayList5 = new ArrayList<>();
        arrayList5.add(1);
        arrayList5.add(3);
        toOutput(arrayList5);

        toOutput("arrayList1 contains all from arrayList5: "
            + arrayList1.containsAll(arrayList5));
        
        arrayList5.add(6);
            
        toOutput("arrayList1 contains all from arrayList5: "
            + arrayList1.containsAll(arrayList5));
        
        // boolean equals(Object obj)
        // Returns true if the invoking collection and obj are equal
        // Otherwise, returns false.
        Collection<Integer> arrayList6 = new ArrayList<>();
        Collection<Integer> arrayList7 = new ArrayList<>();
        
        toOutput(arrayList6);
        toOutput(arrayList7);
        toOutput(arrayList6.hashCode());
        toOutput(arrayList7.hashCode());
        toOutput(arrayList6.equals(arrayList7));
        
        Integer integerValue = Integer.valueOf(200);
        toOutput(integerValue.hashCode());
        arrayList6.add(integerValue);
        toOutput(arrayList6.hashCode());
        arrayList7.add(integerValue);
        toOutput(arrayList7.hashCode());
        toOutput("arrayList6 equals arrayList7: "
            + arrayList6.equals(arrayList7));

        // int hashCode()
        // Returns the has code for the invoking collection.
        Collection<Object> linkedList1 = new LinkedList<>();
        Collection<Object> arrayList8 = new ArrayList<>();
        toOutput(linkedList1.hashCode());
        toOutput(arrayList8.hashCode());
        toOutput("linkedList1.equals(arrayList8): "
            + linkedList1.equals(arrayList8)); // true!!!
            
        Object object1 = new Object();
        linkedList1.add(object1);
        arrayList8.add(object1);
        toOutput(linkedList1.hashCode());
        toOutput(arrayList8.hashCode());
        
        toOutput("linkedList1.equals(arrayList8): "
            + linkedList1.equals(arrayList8)); // true!!!

        // boolean isEmpty()
        toOutput(arrayList8);
        toOutput("arrayList8.isEmpty(): "
            + arrayList8.isEmpty());
        arrayList8.clear();
        toOutput("arrayList8.isEmpty(): "
            + arrayList8.isEmpty());
        
        // Iterator<E> iterator()
        // Returns an iterator for the invocing collection
        arrayList8.add(Integer.valueOf(20));
        arrayList8.add(Integer.valueOf(30));
        arrayList8.add(Integer.valueOf(50));
        arrayList8.add(Integer.valueOf(70));
        Iterator<Object> arrayList8Iterator = arrayList8.iterator();
        while (arrayList8Iterator.hasNext()) {
            System.out.print(arrayList8Iterator.next() + " ");
        }
        toOutput("\n");
        
        Collection<Optional<Integer>> arrayList9 = new ArrayList<>();
        arrayList9.add(Optional.of(200));
        arrayList9.add(Optional.of(300));
        arrayList9.add(Optional.of(500));
        toOutput(arrayList9);
        Iterator<Optional<Integer>> arrayList9Iterator = arrayList9.iterator();
        arrayList9Iterator.forEachRemaining(op -> op = Optional.<Integer>of(op.get() * 3));
        toOutput(arrayList9);
        arrayList9Iterator = arrayList9.iterator();
        arrayList9Iterator.forEachRemaining(op -> System.out.print(op + " "));

        // default Stream<E> parallelStream()
        // Returns a stream that uses the invoking collectn as
        // its source for elements. If possible, the stream supports
        // parallel operations.
        Collection<String> arrayList10 = new ArrayList<>();
        arrayList10.add("String 200");
        arrayList10.add("String 300");
        arrayList10.add("String 600");
        Stream<String> parallelStream = arrayList10.parallelStream();
        parallelStream
            .forEach(System.out::print);
        toOutput("\n");
    }

    private static <T> void toOutput(T message) {
        System.out.println(message);
    }
}


