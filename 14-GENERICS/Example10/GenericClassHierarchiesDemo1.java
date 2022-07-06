/**
 * GenericClassHierarchiesDemo1. A simple
 * generic class hierarchy.
 */
public class GenericClassHierarchiesDemo1 {

    public static void main(String[] args) {
        
        Gen2<Integer> num1 = new Gen2<Integer>(200);
        System.out.println(num1.getObject());
        
        Gen<Integer> num2 = new Gen2<Integer>(300);
        System.out.println(num2.getObject());
    }
}

class Gen<T> {

    private T object;

    public Gen(T ob) {
        object = ob;
    }

    public T getObject() {
        return object;
    }
}

class Gen2<T> extends Gen<T> {

    public Gen2(T ob) {
        super(ob);
    }
}

