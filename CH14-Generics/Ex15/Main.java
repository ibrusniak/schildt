

public class Main {

    public static void main(String[] args) {
        
        Integer[] intArray = new Integer[] {2, 3, 4, 6};
        String[] stringArray = new String[] {"one", "two", "three"};

        System.out.println(arrayContainsItem(10, intArray));
        System.out.println(arrayContainsItem(3, intArray));

        System.out.println(arrayContainsItem("five", stringArray));
        System.out.println(arrayContainsItem("two", stringArray));

        System.out.println(
            Main.<Integer, Integer>arrayContainsItem(3, intArray));
    }

    public static <T extends Comparable<T>, V extends T> boolean arrayContainsItem(T item, V[] array) {
        for (T i : array) {
            if (i.equals(item)) return true;
        }
        return false;
    }
}



