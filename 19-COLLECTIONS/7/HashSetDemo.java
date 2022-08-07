import java.util.HashSet;
import java.util.Arrays;

public class HashSetDemo {
    
    public static void main(String[] args) {
        
        // The advantage of hashing is that it allows the execution
        // time of add( ), contains( ), remove( ), and size( )
        // to remain constant even for large sets.

        HashSet<Integer> s
            = new HashSet<>(Arrays.asList(2, -2, 6, 3, 9));
        
        System.out.println(s); // [-2, 2, 3, 6, 9]
        s.add(6);
        System.out.println(s); // [-2, 2, 3, 6, 9]
        s.add(null);
        System.out.println(s); // [null, -2, 2, 3, 6, 9]
        s.add(null);
        System.out.println(s); // [null, -2, 2, 3, 6, 9]
        s.remove(3);
        System.out.println(s); // [null, -2, 2, 6, 9]
    }
}

