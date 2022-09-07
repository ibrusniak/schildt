import java.util.ArrayList;
import java.util.List;

/**
 * ErasureDemo2
 */
public class ErasureDemo2 {

    public static void main(String[] args) {
        
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        // All - true
        System.out.println(integers.getClass() == doubles.getClass());
        System.out.println(doubles.getClass() == objects.getClass());
        System.out.println(integers.getClass() == objects.getClass());
    }
}


