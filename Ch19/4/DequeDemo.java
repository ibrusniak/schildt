import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeDemo {
    
    public static void main(String[] args) {
        
        // The Deque interface extends Queue and declares the behavior
        // of a double-ended queue. Double-ended queues can function as
        // standard, first-in, first-out queues or as last-in, first-out
        // stacks.

        Deque<Integer> stack = new ArrayDeque<>();

        // Classic stack ops:
        // push - adds element
        // pop - removes element

        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(1);

        println(stack); // [1, 3, 3, 2]
        
        println(stack.pop()); // 1
        println(stack.pop()); // 3
        println(stack); // [3, 2]

        println("");

        Deque<Integer> d2 = new ArrayDeque<>();
        d2.push(20);
        d2.push(0);
        d2.push(50);
        d2.push(-20);

        println(d2);

        // Iterator<E> descengingIterator()
        // Returns an iterator that moves from the tail to the head of
        // the deque. In other words, it returns a reverse iterator.
        
        Iterator<Integer> descendiIterator = d2.descendingIterator();
        while (descendiIterator.hasNext()) {
            System.out.print(descendiIterator.next() + " ");
        }
        println("");
    }

    private static void println(Object o) {
        System.out.println(o);
    }
}
