

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;

import static java.util.Collections.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList1 = new LinkedList<>();
        boolean added = addAll(linkedList1, "Q", "D", "C", "A", "A");
        System.out.println("added = " + added);
        System.out.println("linkedList1: " + linkedList1);

        System.out.println();

        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        arrayDeque1.push(2);    // [2]
        arrayDeque1.push(3);    // [3, 2]
        arrayDeque1.push(4);    // [4, 3, 2] 
        System.out.println(arrayDeque1);
        System.out.println(arrayDeque1.pop()); // 4  
        System.out.println(arrayDeque1.pop()); // 3
        System.out.println(arrayDeque1.pop()); // 2
        System.out.println(arrayDeque1);    // [] LIFO = Last In First Out

        arrayDeque1.push(5);
        arrayDeque1.push(6);
        arrayDeque1.push(7);

        Queue<Integer> lifoQueue = asLifoQueue(arrayDeque1);
        System.out.println();
        System.out.println(arrayDeque1);
        System.out.println(lifoQueue);
        System.out.println(lifoQueue.poll());
        System.out.println(lifoQueue.poll());
        System.out.println(lifoQueue.poll());
        System.out.println(arrayDeque1);
        System.out.println(lifoQueue);

        System.out.println();
        System.out.println();

        linkedList1 = new LinkedList<>();
        linkedList1.add("F");
        linkedList1.add("B");
        linkedList1.add("D");
        linkedList1.add("Q");
        System.out.println("linkedList1: " + linkedList1);
        System.out.println("linkedList1.getFirst(): " + linkedList1.getFirst());
        System.out.println("linkedList1.getLast(): " + linkedList1.getLast());

        Queue<String> lifoQueue2 = asLifoQueue(linkedList1);
        System.out.println("lifoQueue: " + lifoQueue2);
        System.out.println(lifoQueue2.poll());
    }
}

