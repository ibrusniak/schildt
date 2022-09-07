import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {
    
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        
        System.out.println("initial capacity: " + list1.size()); // 0
        list1.add("Q");
        list1.add("F");
        System.out.println("current capacity: " + list1.size());

        try {
            list1.add(4, "D"); // IndexOutOfBoundException
        } catch (Exception e) {
            System.out.println(e);
        }
        list1.add(1, "D");
        System.out.println(list1);

        list1.remove("Q");
        System.out.println(list1);

        list1.remove(0);
        System.out.println(list1);

        list1.ensureCapacity(200);
        System.out.println(list1.size());

        list1.trimToSize();
        System.out.println(list1.size());
    }
}
