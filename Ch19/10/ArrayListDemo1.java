import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {
    
        test1();
        test2();
    }
    
    /**
     * The method demonstrates that the list is shifted
     * to the right when adding a new element by index
     * (zero-based index)
     */
    private static void test1() {

        System.out.println();

        ArrayList<String> list = new ArrayList<>();
    
        list.add("test1");
        list.add("test2");
        list.add("test3");
    
        System.out.println(list); // [test1, test2, test3]
        
        System.out.println(list.get(1)); // test2
        
        list.add(1, "test4");
        System.out.println(list.get(1)); // test4

        System.out.println(list); // [test1, test4, test2, test3]
    }

    /**
     * The method demonstrates that String is a primitive type
     * and is "pass-by-value". So an element can not be deleted
     * using a variable name.
    */
    private static void test2() {
        
        System.out.println();

        var list = new ArrayList<String>();

        String s1 = "test1", s2 = "test2";

        list.add(s1);
        list.add(s2);

        System.out.println(list); // [test1, test2]

        s1 = "test3";
        list.remove(s1);

        System.out.println(list); // [test1, test2]
        list.remove("test2");
        System.out.println(list); // [test1]
    }
}

