import java.util.Arrays;
import java.util.List;

public class ArraysDemo1 {

    public static void main(String[] args) {
        
        Integer[] source = new Integer[] {
            1, 3, 4, -1, 3, 2, 6, 8, 0, -2
        };

        List<Integer> list = Arrays.asList(source);

        String s = Arrays.toString(source);

        System.out.println(s);
        System.out.println(list);

        Object[] array1 = list.toArray();

        s = Arrays.toString(array1);
        System.out.println(s);

        System.out.println(array1[0].getClass().getName());
        System.out.println(array1.getClass().getName());

        try {
            int index = Arrays.binarySearch(source, "key"); // ClassCastException
        } catch (Exception e) {}

        // The array must be sorted
        Arrays.sort(source);
        System.out.println(Arrays.toString(source));
        int index = Arrays.binarySearch(source, 1);
        System.out.println();
        System.out.println("index = " + index);
        index = Arrays.binarySearch(source, -2);
        System.out.println("index = " + index);

        System.out.println();

        int[] array2 = new int[] { 1, 3, 5, 6 };
        int[] array3 = new int[] { 1, 3, 5, 9 };

        // Compares two int arrays lexicographically.
        int res = Arrays.compare(array2, array3);
        System.out.println(res);

        record Human(String name) {};

        Human[] humans = new Human[] {
            new Human("John"),
            new Human("Susan"),
            new Human("Rudger")
        };

        String st = Arrays.deepToString(humans);
        
        System.out.println(st);
        System.out.println(humans[0]);
        
        int[][] multiarray = new int[][] {
            { 2, 3, 5 },
            { 1, -2, 8 },
            { 0, 3, 9 },
        };
        
        System.out.println(multiarray);
        System.out.println(Arrays.deepToString(multiarray));
        // output: [[2, 3, 5], [1, -2, 8], [0, 3, 9]]
        
        int[] ints1 = new int[] { 1, 3, 4 };
        int[] ints2 = new int[] { 1, 3, 4 };
        int[] ints3 = new int[] { 1, 3, 6 };
        System.out.println("equals1 = " + Arrays.equals(ints1, ints2));
        System.out.println("equals2 = " + Arrays.equals(ints1, ints3));
    }
}

