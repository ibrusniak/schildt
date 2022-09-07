import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(-2);
        al.add(0);
        al.add(3);
        al.add(5);

        prn(al);

        LinkedList ll = new LinkedList<>(al);

        prn(ll);

        LinkedList<Object> stack = new LinkedList<>();

        prn(stack);
        stack.push(10);
        stack.push(2.3);
        stack.push(true);
        prn(stack);
        popAndPring(stack);
        popAndPring(stack);
        popAndPring(stack);
        prn(stack);
    }

    private static <T> void prn(T o) {
        System.out.println(o);
    }

    private static <T extends java.util.Deque> void popAndPring(T stack) {
        prn(stack.pop());
    }
}

