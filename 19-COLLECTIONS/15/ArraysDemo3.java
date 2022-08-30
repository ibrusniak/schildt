import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo3 {
    
    public static void main(String[] args) {
        
        Integer[] source = new Integer[] {
            -6, -5, -4, -3, -2, -1, 0 , 1, 2, 3, 4, 5, 6
        };

        System.out.println(Arrays.toString(source));
        // outut: [-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6]
        
        List<Integer> list = Arrays.asList(source);
        Collections.shuffle(list);
        
        System.out.println(Arrays.toString(source)); // source is shuffled
        // output: [2, 0, 3, -3, 5, -5, -6, -2, 1, 6, -1, 4, -4] (one of the variants)
    }
}

