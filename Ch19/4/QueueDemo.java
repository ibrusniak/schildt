import java.util.Queue;
import java.util.PriorityQueue;

public class QueueDemo {
    
    public static void main(String[] args) {

        // The Queue interface extends Collection and
        // declares the behavior of a queue, which is often
        // a first-in, first-out list. However, there are types
        // of queues in which the ordering is based upon other
        // criteria.

        Queue<Integer> queue1 = new PriorityQueue<>();

        queue1.add(20);
        queue1.add(30);
        queue1.add(40);

        println(queue1);
        
        // Boolean offer(E obj)
        // Attempts to add obj to the queue. Returns true if obj was
        // added and false otherwise.

        queue1.offer(10);
        queue1.offer(30);
        queue1.offer(50);
        
        println(queue1);

        // E element()
        // Returns the element at the head of the queue. The element is not removed.
        // It throws NoSuchElementException if the queue is empty

        println(queue1.element());
        println(queue1.element());

        // E peek()
        // Returns the element at the head of the queue.
        // The element is not removed.

        println(queue1.peek());
        println(queue1.peek());

        // E poll
        // Returns the element at the head of the queue, removing the element
        // in the process. It returns null if the queue is empty.

        println(queue1); // [10, 20, 40, 30, 30, 50]
        println(queue1.poll()); // 10
        println(queue1.poll()); // 20
        println(queue1); // [30, 30, 40, 50]

        // E remove
        // Removes the element at the head of the queue, returning the element in the
        // process. It throws NoSuchElementException if the queue is empty

        (new PriorityQueue<Integer>()).remove();
    }
    
    private static void println(Object o) {
        System.out.println(o);
    }
}

