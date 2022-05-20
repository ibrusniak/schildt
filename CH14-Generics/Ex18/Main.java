import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[] { -3, 0, -6, 9, 2, 1, 1, 0, 0, 10 };
        MyClass<Integer> m1 = new MyClass<Integer>(array);

        System.out.println(m1.min());
        System.out.println(m1.max());
    }
}


