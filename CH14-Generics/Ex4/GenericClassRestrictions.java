
public class GenericClassRestrictions {

    public static void main(String[] args) {
        
        // Generics work only with reference types
        // GenericClass<int> gc0 = new GenericClass<int>(20); // This does not compile
        GenericClass<Integer> gc1 = new GenericClass<Integer>(12);
        GenericClass<Integer> gc2 = new GenericClass<Integer>(Integer.valueOf(20));

        // Generic types differ based on their type arguments
        GenericClass<Float> gc3 = new GenericClass<Float>(2.4f);
        GenericClass<Character> gc4 = new GenericClass<Character>(Character.valueOf('A'));
        
        System.out.printf("\ngc3: %s, %s\ngc4: %s, %s\n",
            gc3.getClass(), gc3,  gc4.getClass(), gc4);

        // Type mismatch: cannot convert from GenericClass<Character> to GenericClass<Float>
        // This is part of the way that generics add type safety and prevent errors
        // gc3 = gc4;
    }
}

class GenericClass<T> {

    private T value;

    public GenericClass(T v) {
        value = v;
    }
}


