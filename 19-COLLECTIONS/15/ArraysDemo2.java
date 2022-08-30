import java.util.Arrays;

public class ArraysDemo2 {
    
    public static void main(String[] args) {
        
        Integer[] array1 = new Integer[] { 2, 3, 4, 5 };
        System.out.println(Arrays.toString(array1));
        Arrays.parallelPrefix(array1, (a, b) -> a + b);
        System.out.println(Arrays.toString(array1));
    }
}
