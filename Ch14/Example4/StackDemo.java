
/**
 * StackDemo. Demonstrates use of class Stack
 */
public class StackDemo {

    public static void main(String[] args) {
        
        Stack<Integer> integerStack = new Stack<Integer>();
        try {
            int i = integerStack.pop();
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        integerStack.push(200);
        integerStack.push(300);
        System.out.println(integerStack);
        try {
            System.out.println(integerStack.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(integerStack);
        try {
            System.out.println(integerStack.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(integerStack);
        try {
            System.out.println(integerStack.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Stack<T> {

    private Object[] container = new Object[0];

    public void push(T item) {
        if (container.length == 0) {
            container = new Object[1];
            container[0] = (Object)(item);
        } else {
            Object[] tmp = new Object[container.length + 1];
            System.arraycopy(container, 0, tmp, 0, container.length);
            tmp[container.length] = (Object)(item);
            container = tmp;
        }
    }

    @SuppressWarnings("unchecked")
    public T pop() throws EmptyStackException {
        if (container.length == 0) {
            throw new EmptyStackException("Empty stack exception. Cannot pop!");
        }
        T res = (T)(container[container.length - 1]);
        if (container.length == 1) {
            container = new Object[0];
        } else {
            Object[] tmp = new Object[container.length - 1];
            System.arraycopy(container, 0, tmp, 0, container.length - 1);
            container = tmp;
        }
        return res;
    }

    static class EmptyStackException extends Exception {
        EmptyStackException(String message) {
            super(message);
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (Object item : container) {
            res += item.toString() + " ";
        }
        return res;
    }
}

