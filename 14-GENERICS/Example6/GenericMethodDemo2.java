/**
 * GenericMethodDemo2
 */
public class GenericMethodDemo2 {

    // Determines if an object is in an array.
    static <T extends Comparable<T>, V extends T> boolean isIn(T item, V[] array) {
        for (int i = 0; i < array.length; i++)
            if(item.equals(array[i])) return true;
        
        return false;
    }

    public static void main(String[] args) {
        
        Integer[] nums = {1, 2, 3, 4, 5};

        if (isIn(2, nums)) {
            System.out.println("2 is in nums");
        }

        if (!isIn(7, nums)) {
            System.out.println("7 is not in nums");
        }

        System.out.println();
        
        String[] strs = {"One", "Two", "Five"};
        
        if (isIn("Five", strs)) {
            System.out.println("Five is in strs");
        }

        System.out.println();
        
        // Although type inference will be sufficient for most generic method
        // calls, you can explicitly specify the type argument if needed.
        System.out.println(
            GenericMethodDemo2.<Integer, Integer>isIn(10, nums));
    }
}

