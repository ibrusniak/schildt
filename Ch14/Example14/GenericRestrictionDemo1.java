/**
 * GenericRestrictionDemo1.
 * Type Parameters Can’t Be Instantiated
 */
public class GenericRestrictionDemo1 {

    public static void main(String[] args) {
        
    }
}

class Gen<T> {
    private T ob;

    public Gen() {
        // Here, it is illegal to attempt to create an instance of T. The reason should be
        // easy to understand: the compiler does not know what type of object to create. T
        // is simply a placeholder.
        // ob = new T();
        
        // But this works with compiler's warning (unchecked)
        ob = (T)(new Object()); // warning: [unchecked] unchecked cast
    }
}


