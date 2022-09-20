import java.util.Iterator;

public class IterableDemo1<T> implements Iterable<T> {

    private T[] elementData;

    public IterableDemo1(T[] source) {
        elementData = source;
    }

    public static void main(String[] args) {
        
        IterableDemo1<Integer> iterable1 = new IterableDemo1<>(
            new Integer[] {2, 3, 4, 5, 4, 2, 0, 12, 0});

        IterableDemo1<String> iterable2 = new IterableDemo1<>(
            new String[] {"foo", "bar", "baz"});
        
        for (Integer i : iterable1) System.out.print(i + " ");
        System.out.println();
        for (String s : iterable2) System.out.print(s + " ");
        System.out.println();
    }

    public Iterator<T> iterator() {

        return new Iterator<T>() {
        
            private IterableDemo1<T> iterable = IterableDemo1.this;
            private int pointer = 0;

            public boolean hasNext() {
                return pointer < iterable.elementData.length;
            }

            public T next() {
                
                T result = null;
                if (hasNext()) {
                    result = iterable.elementData[pointer];
                    pointer++;
                }
                return result;
            }
        };
    }
}

