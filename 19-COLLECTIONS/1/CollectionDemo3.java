import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * CollectionDemo3
 */
public class CollectionDemo3 {

    public static void main(String[] args) {

        Collection<Integer> al1 = new ArrayList<>();
        al1.add(200);
        al1.add(300);
        al1.add(300);
        al1.add(500);
        al1.add(500);

        emptyLine();
        toOutput(al1);

        // boolean remove(Object obj)
        // Removes one instance of obj from the invoking collection.
        // Returns true if the element was removed. Otherwise, return false.
        al1.remove(600);
        al1.remove(500);
        toOutput(al1);

        // boolean removeAll(Collection<?> c)
        // Removes all elements of c from the invoking collection.
        // Returns true if the collection changed (i.e., elements
        // were removed). Otherwise, return false.
        al1.clear();
        al1.add(2);
        al1.add(4);
        al1.add(3);
        al1.add(3);
        al1.add(5);

        Collection<Integer> toDelete = new LinkedList<>();
        toDelete.add(3);
        toDelete.add(2);
        toDelete.add(8);

        emptyLine();
        toOutput(al1);
        toOutput(toDelete);
        al1.removeAll(toDelete);
        toOutput("after deletion");
        toOutput(al1);

        // default boolean removeIf(Predicate<? super E> predicate)
        // Removes from the invoking collection those elements
        // that satisfy the condition specified by predicate
        al1.clear();
        al1.add(2);
        al1.add(-2);
        al1.add(-3);
        al1.add(8);
        al1.add(-5);
        al1.add(7);
        emptyLine();
        toOutput(al1);
        al1.removeIf(i -> i == -2 || i == 7);
        toOutput(al1);

        // boolean retainAll(Collection<?> c)
        // Removes all elements from invoking collection except
        // those in c. Returns true if the collection changed (i.e.,
        // elements were removed). Otherwise, return false.
        al1.clear();
        al1.add(2); al1.add(3); al1.add(4); al1.add(6);
        Collection<Integer> deleteExcept = new LinkedList<>();
        deleteExcept.add(2);
        deleteExcept.add(7);
        deleteExcept.add(6);
        emptyLine();
        toOutput(al1);
        toOutput(deleteExcept);
        al1.retainAll(deleteExcept);
        toOutput(al1);

        // int size()
        toOutput(al1.size());
    }

    private static void emptyLine() {
        System.out.println();
    }

    private static <T> void toOutput(T object) {
        System.out.println(object);
    }
}

