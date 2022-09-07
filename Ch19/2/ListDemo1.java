import static utils.MyUtills.*;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

        // E get(int index)
        // int indexOf(Object obj)
        // int lastIndexObj(Object obj)
        List<Integer> list2 = (List<Integer>)(new ArrayList<Integer>());
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(2);
        println(list2);
        println(list2.get(0));
        println(list2.get(3));
        println(list2.indexOf(5));
        println(list2.lastIndexOf(2));

        emptyline();

        // ListIterator<E> listIterator
        // ListIterator<E> listIterator(int index)
        println(list2);
        ListIterator<Integer> listIterator1 = list2.listIterator();
        while (listIterator1.hasNext()) {
            print(String.format("[%s|%s]",
                listIterator1.nextIndex(),listIterator1.next()));
        }
        System.out.println();
        while (listIterator1.hasPrevious()) {
            print(String.format("[%s|%s]",
            listIterator1.previousIndex(),listIterator1.previous()));
        }
        System.out.println();
        println(list2);
        while (listIterator1.hasNext()) {
            listIterator1.set(listIterator1.next() * 2);
        }
        println(list2);
        while (listIterator1.hasPrevious()) {
            if (listIterator1.previous() == 10 || listIterator1.previous() == 14) {
                listIterator1.remove();
            }
        }
        println(list2);
        while (listIterator1.hasNext()) {
            int next = listIterator1.next();
            if (next % 2 == 0) {
                listIterator1.add(next + 3);
            }
        }
        println(list2);
        
        emptyline();

        // static <E> List<E> of(parameters-list)
        // Creates an unmodifiable list containing the elements
        // specified in parameter-list. Null elements are not
        // allowed. Many overloaded versions are provided.
        List<Double> list3 = null;
        try {
            list3 = List.<Double>of(2.3, 3.4, null);
        } catch (Exception e) {
            println("Can not create! " + e);
        }
        try {
            list3 = List.<Double>of(2.3, 3.4, 2.3);
        } catch (Exception e) {
            println("Can not create! " + e);
        }
        println(list3);
        println(list3.getClass()); // !! java.util.ImmutableCollections$ListN

        emptyline();

        // E remove(int index)
        // Removes the element at position index from the
        // invoking list and returns the deleted element. The
        // resulting list is compacted. That is, the indexes of
        // subsequent elements are decremented by one.
        println(list3);
        try {
            // list3 is java.util.ImmutableCollections$ListN
            // so we rather can not remove
            Double d = list3.remove(2);
        } catch (Exception e) {
            println("Can not remove element because of " + e);
        }
        emptyline();
        List<Integer> list4 = (List<Integer>)(new LinkedList<Integer>());
        Collections.addAll(list4, 2, 3, 4, 5, 6, 8);
        println(list4);
        Integer i1 = list4.remove(2);
        Integer i2 = list4.remove(3);
        println(list4);
        println(i1 + "  " + i2);

        emptyline();

        // default void replaceAll(UnaryOperator<E> opToApply)
        // Updates each element in the list with the value obtained
        // from the opToApply function.
        list4.clear();
        Collections.addAll(list4, 3, 4, 5, 6);
        println(list4.getClass());
        println(list4); // [3, 4, 5, 6]
        list2.replaceAll(n -> n * 2);
        println(list4); // [3, 4, 5, 6] - type of elements is Integer

        emptyline();
        class Container<T> {
            private T value;
            public Container(T value) {
                this.value = value;
            }
            public T getValue() {
                return value;
            }
            public void setValue(T value) {
                this.value = value;
            }
            @Override
            public String toString() {
                return "[" + Integer.toHexString(hashCode()) + ": " + value + "]";
            }
        }
        List<Container<Integer>> list5 = new ArrayList<>();
        Collections.addAll(list5, 
            new Container<>(5),
            new Container<>(17),
            new Container<>(2),
            new Container<>(9),
            new Container<>(3)
        );
        println(list5);
        list5.replaceAll(value -> new Container<>(value.getValue() * 10));
        println(list5);
        list5.replaceAll(value -> {
            value.setValue(value.getValue() * 20);
            return value;
        });
        println(list5);

        emptyline();
        
        // E set(int index, E obj)
        // Assign obj to the location specified by index within the
        // invoking list. Returns the old value

        // default void sort(Comparator<? super E> comp)
        // Sorts the list using the comparator specified by comp.
        List<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 8, 10, 2, 1, 12, 5, 0, -2, -3, 0);
        println(list6);
        list6.sort(Integer::compare);
        println(list6);
        
        class DoubleContainer implements Comparable {
            private Double v;
            public DoubleContainer(Double v) {
                this.v = v;
            }
            public void setV(Double v) {
                this.v = v;
            }
            public Double getV() {
                return v;
            }
            @Override
            public String toString() {
                return "[" + Integer.toHexString(hashCode()) + " " + v + "]";
            }
            @Override
            public int compareTo(Object o) {
                DoubleContainer d = (DoubleContainer)o;
                if (v == d.getV()) return 0;
                if (v > d.getV()) return 1;
                return -1;
            };
        }

        List<DoubleContainer> list7 = new ArrayList<>();
        Collections.addAll(list7, 
            new DoubleContainer(3.3),
            new DoubleContainer(-3.3),
            new DoubleContainer(-6.67),
            new DoubleContainer(7d),
            new DoubleContainer(0d),
            new DoubleContainer(2.30)
        );
        emptyline();
        println(list7);
        list7.sort(DoubleContainer::compareTo);
        println(list7);
        list7.sort(new Comparator<DoubleContainer>() {
            public int compare(DoubleContainer o1, DoubleContainer o2) {
                // reverse sorter
                if (o1.getV() > o2.getV()) return -1;
                if (o1.getV() < o2.getV()) return 1;
                return 0;
            };
        });
        println(list7);

        emptyline();

        // List<E> subList(int start, int end)
        // Returns a list that includes elements from start to end-1
        // in the invoding list. Elements in the returned list are
        // also regerenced by the invoking object.
        List<Integer> list8 = Arrays.asList(2, 3, 5, 7, 9);
        List<Integer> list9 = list8.subList(2, 4); // end-1
        println(list8); // [2, 3, 5, 7, 9] 
        println(list9); // [5, 7]
    }
}



