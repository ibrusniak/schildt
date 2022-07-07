/**
 * TypeInferenceDemo1
 */
public class TypeInferenceDemo1 {

    public static void main(String[] args) {
        
        GenericClass<Integer, String> g1 = new GenericClass<Integer, String>();
        GenericClass<Double, Character> g2 = new GenericClass<>(); // Type inference
        
        // local variable type inference
        var g3 = new GenericClass<Boolean, String>();
        var g4 = g1;

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
    }
}

class GenericClass<T, V> {
    
}

