import java.util.Stack;
import java.util.ArrayDeque;

public class StackDemo0 {
    
    public static void main(String[] args) {
        
        // Legacy class stackLegacy. Deque is new version

        Stack<Integer> stackLegacy = new Stack<>();

        stackLegacy.push(1);
        stackLegacy.push(2);
        stackLegacy.push(3);
        stackLegacy.push(4);

        System.out.println(stackLegacy);

        System.out.println(stackLegacy.pop());
        System.out.println(stackLegacy.pop());
        
        System.out.println("Legacy stack size = " + stackLegacy.size());
        
        ArrayDeque<Integer> stackModern = new ArrayDeque<>();
        
        stackModern.push(1);
        stackModern.push(2);
        stackModern.push(3);
        stackModern.push(4);
        
        System.out.println(stackModern);
        
        System.out.println(stackModern.pop());
        System.out.println(stackModern.pop());

        System.out.println("Modern stack size = " + stackModern.size());
    }
}
