import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

public class ArrayListDemo3 {
    
    public static void main(String[] args) {
        
        List<Integer> list1 = Arrays.asList(2, 3, 4, 5);
        System.out.println(list1);
        Object array[] = list1.toArray();

        for (Object o : array)
            System.out.print(o + " ");
        System.out.println();

        List<Integer> list2 = List.<Integer>of(5, 6, 7, 8);
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        java.util.Collections.<String>addAll(list3, "A", "B", "C", "D");
        Object array2[] = list3.toArray();
        
        for (Object s : array2)
            System.out.print(s + " ");
        System.out.println();

        String array3[] = new String[list3.size()];
        list3.<String>toArray(array3);
        
        for (String s : array3)
            System.out.print(s + " ");
        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(6);
        intList.add(-1);

        class MyOwnArrayGenerator implements IntFunction<Integer[]> {

            @Override
            public Integer[] apply(int value) {
                return new Integer[]{value};
            }
        }

        MyOwnArrayGenerator generator = new MyOwnArrayGenerator();
        Integer[] intArray = intList.toArray(generator);

        for (int i : intArray)
            System.out.print(i + " ");
        System.out.println();
        
        intArray = intList.toArray(i -> new Integer[]{i});
        
        for (int i : intArray)
            System.out.print(i + " ");
        System.out.println();
    }

}
