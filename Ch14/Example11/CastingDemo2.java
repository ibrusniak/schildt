
import java.util.ArrayList;
import java.util.List;

/**
 * CastingDemo2
 */
public class CastingDemo2 {

    public static void main(String[] args) {

        List<Integer> listIntegers = new ArrayList<>();
        List<Double> listDoubles = new ArrayList<>();

        // listIntegers.add(2.3);

        System.out.println(listIntegers.getClass());
        System.out.println(listDoubles.getClass());

        // Imcompatible types
        // listDoubles = listIntegers;
    }
}


