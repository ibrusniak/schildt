import java.util.Iterator;

public class IterableDemo0 {

    public static void main(String[] args) {

        String[] array0 =  new String[] {"foo", "bar", "baz"};
        MyClass<String> myClass0 = new MyClass<>(array0);

        Iterator<String> iterator = myClass0.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        iterator = myClass0.iterator();

        iterator.forEachRemaining((t) -> System.out.println(t));
    }
}

class MyClass<T> implements Iterable<T> {

    private T[] elementData;

    public MyClass(T[] array) {
        elementData = array;
    }

    class MyClassIterator<T> implements Iterator<T> {

        private MyClass<T> ref;
        private int currentElement = 0;

        public MyClassIterator(MyClass<T> ref) {
            this.ref = ref;
        }

        @Override
        public boolean hasNext() {
            return
                currentElement < ref.elementData.length;
        }

        @Override
        public T next() {

            T element = null;
            if (hasNext()) {
                element = ref.elementData[currentElement];
                currentElement++;
            }
            return element;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyClassIterator<T>(this);
    }
}

