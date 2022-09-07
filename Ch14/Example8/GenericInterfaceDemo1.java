/**
 * GenericInterfaceDemo1. Generic interface example.
 */
public class GenericInterfaceDemo1 {

    public static void main(String[] args) {
        
        MyClass<Integer> intsContainer =
            new MyClass<Integer>(new Integer[]{2, 6, 1, 0, 3, 2, 5 , -3, -6});
        System.out.println(intsContainer.min());
        System.out.println(intsContainer.max());
    }
}

interface MinMax<T extends Comparable<T>> {

    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    MyClass(T[] vals) {
        this.vals = vals;
    }

    public T min() {
        T min = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (min.compareTo(vals[i]) == 1) {
                min = vals[i];
            }
        }
        return min;
    }
    
    public T max() {
        T max = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (max.compareTo(vals[i]) == -1) {
                max = vals[i];
            }
        }
        return max;
    }
}

