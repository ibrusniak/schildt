/**
 * Restriction1. Generics work only with
 * reference types. This file demonstrates this.
 */
public class Restriction1 {

    public static void main(String[] args) {
        
        // Autoboxing. Implicit convertion int to java.util.Integer
        Generic<Integer> genericInteger1 = new Generic<Integer>(100);
        // Explicit
        Generic<Integer> genericInteger2 = new Generic<Integer>(Integer.valueOf(300));

        genericInteger1.showTypeArgumentType();
        genericInteger2.showTypeArgumentType();

        // Next code will occur compilation error!
        // Generic<int> genericInteger3 = new Generic<int>(2);
    }
}

class Generic<V> {

    private V object;

    Generic(V arg) {
        object = arg;
    }

    public void showTypeArgumentType() {
        System.out.println("The type argument type is: "
            + object.getClass().getName());
    }
}

