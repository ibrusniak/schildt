import java.util.Collection;
import java.util.LinkedList;

/**
 * CollectionDemo4
 */
public class CollectionDemo4 {

    public static void main(String[] args) {
        
        Collection<Integer> linkedList1 = new LinkedList<>();

        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);

        emptyLine();
        toConsole(linkedList1);

        // default <T> T[] toArray(IntFunction<T[]> arrayGen)
        // Returns an array of the ekements from the invoking
        // collection. The returned array is created by the function
        // specified by arrayGen. (Added by JDK 11)
        Integer[] array1 = linkedList1.toArray(i -> new Integer[]{i});
        for (Integer i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        emptyLine();

        // Object[] toArray()
        // Returns an array of the elements from the invoking collection.
        Object[] array2 = linkedList1.toArray();
        for (Object o : array2) {
            System.out.print(o + " ");
        }
        System.out.println();

        emptyLine();

        // <T> T[] toArray(T array[])
        // Returns an array of the elements from the onvoking
        // collection.
        toConsole(linkedList1);
        Integer[] array3 = new Integer[20];
        Integer[] array4 = new Integer[2];
        array3 = linkedList1.toArray(array3);
        array4 = linkedList1.toArray(array4);
        
        for (Integer i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // If the size of array (target) is less than
        // the number of elements, a new array of the
        // necessary size is allocated and returned.
        for (Integer i : array4) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void emptyLine() {
        System.out.println();
    }

    private static <T> void toConsole(T message) {
        System.out.println(message);
    }
}


