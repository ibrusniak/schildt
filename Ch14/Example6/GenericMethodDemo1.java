/**
 * GenericMethodDemo1. Demonstrates use of generic method.
 */
public class GenericMethodDemo1 {

    public static void main(String[] args) {
        
        println(2);
        println("Hello");
        println(2.3);
        println(new Class0());
    }

    public static <T> void println(T arg) {
        System.out.println(arg.getClass().getName()
            + " value: " + arg);
    }

    public static class Class0 {

        @Override
        public String toString() {
            return super.toString();
        }
    }
}

