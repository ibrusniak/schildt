import static utils.MyUtills.*;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo1 {

    public static void main(String[] args) {

        runTest1();
    }

    public static void runTest1() {

        emptyline();
        println("Test 1");

        List<Integer> list1 = (List<Integer>)(new ArrayList<Integer>());
        list1.add(1);
        list1.add(2);
        list1.add(3);
        println(list1); // [1, 2, 3]

        // void add(int index, E obj)
        // Insert obj into the invoking list at the index passed in
        // index. Any prexisting elements at of beyond the poing of insertion
        // are shifted up. Thus, no elements are overwritten.
        list1.add(1, 4);
        println(list1); // [1, 4, 2, 3]
        list1.add(2, 5);
        println(list1); // [1, 4, 5, 2, 3]

        emptyline();

        // boolean addAll(int index, Collection<? extends E> c)
        // Inserts all elements of c into the invoking list at the index
        // passed in index. Any preexisting elements at of beyond the point
        // of insertion are shifted up. Thus, no elements are overwritten.
        // Returns true if the invoking list chnges and returns false otherwise.
        List<Number> target = new ArrayList<>();
        target.add(3);
        target.add(4);
        target.add(5);
        println(target); // [3, 4, 5]
        List<Double> source = new LinkedList<>();
        source.add(3.3);
        source.add(5.2);
        println(source); // [3.3, 5.2]
        target.addAll(1, source);
        println(target); // [3, 3.3, 5.2, 4, 5]

        emptyline();
        
        // static <E> List<E> copyOf(Collection<? extends E> from)
        // Returns a list that contains the same elements
        // as that specified by from. The returned list is unmodifable.
        // Null values are not allowed.
        List<Integer> source1 = new ArrayList<>();
        source1.add(2);
        source1.add(3);
        source1.add(4);
        // Unmodifable. Nulls are not allowed.
        List<Number> copyOfSource1 = List.copyOf(source1);
        println(source1);
        println(copyOfSource1);
        try {
            copyOfSource1.add(0, 20);
        } catch (Exception e) {
            println(e);
        }

        emptyline();
    }
}



