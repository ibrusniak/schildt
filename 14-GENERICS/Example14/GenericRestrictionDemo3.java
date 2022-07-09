/**
 * GenericRestrictionDemo3.
 * Generic array restrictions.
 */
public class GenericRestrictionDemo3 {

    public static void main(String[] args) {
        
        Integer n[] = {1, 2, 3, 4, 5};
        Gen<Integer> iOb = new Gen<Integer>(50, n);

        // Can't create an array of type-specific generic references.
        // Gen<Integer> gens[] new Gen<Integer>[10];

        // This is OK.
        Gen<?> gens[] = new Gen<?>[10];
        gens[0] = new Gen<Double>(2.3, new Double[]{5.2, 6.2});
    }
}

class Gen<T extends Number> {

    private T ob;
    private T[] vals;

    public Gen(T o, T[] nums) {

        ob = o;

        // This statement is illegal.
        // Can't create any array of T.
        // vals = new T[10];

        // But, this statement is OK.
        vals = nums;
    }
}

