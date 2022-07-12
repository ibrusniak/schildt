
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.IntFunction;

/**
 * CollectionDemo5
 */
public class CollectionDemo5 {

    public static void main(String[] args) {
        
        Collection<Integer> arrayList = new ArrayList<>();
        
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(-1);
        arrayList.add(3);

        System.out.println(arrayList);

        Integer array1[] = arrayList.toArray(new IntFunctionImplementation());

        for (Integer i : array1)
            System.out.print(i + " ");
        
        System.out.println();
    }
}

class IntFunctionImplementation implements IntFunction<Integer[]> {

    @Override
    public Integer[] apply(int value) {
        return new Integer[]{value};
    }
}


