
/**
 * ContainerDemo. Demonstrates use of parametrized class.
 */
public class Ex1 {

    public static void main(String[] args) {
        
        String[] items = new String[] {"one", "two", "three"};
        Container<String> stringContainer = new Container<String>(items);
        System.out.println(stringContainer);

        Container<Double> doubleContainer
            = new Container<Double>(new Double[] {3.2, 3.3, 3.4, 3.5});
        System.out.println(doubleContainer);

        Double[] doubleArray = doubleContainer.getItems();
        for(Double d : doubleArray) {
            System.out.print(d.toString() + " ");
        }
        System.out.println();

        System.out.println("Item 2: " + doubleContainer.getItem(2));
    }
}

class Container<T> {

    T[] items;

    Container(T[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String res = "";
        for(T s : items) {
            res += s.toString() + "\n";
        }
        return res;
    }

    public T[] getItems() {
        return items;
    }

    public T getItem(int index) {
        return items[index];
    }
}

