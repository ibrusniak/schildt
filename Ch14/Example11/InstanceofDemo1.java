/**
 * InstanceofDemo1. Demonstrates run-time type ID implications
 * of generic class hierarchy.
 */
public class InstanceofDemo1 {

    public static void main(String[] args) {
        
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(89);
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");
        
        System.out.println("iOb2 instanceof Gen2<?>: " + (iOb2 instanceof Gen2<?>));
        System.out.println("iOb2 instanceof Gen<?>: " + (iOb2 instanceof Gen<?>));
        
        System.out.println();
        System.out.println("strOb2 instanceof Gen2<?>: " + (strOb2 instanceof Gen2<?>));
        System.out.println("strOb2 instanceof Gen<?>: " + (strOb2 instanceof Gen<?>));

        System.out.println();
        System.out.println("iOb instanceof Gen2<?>: " + (iOb instanceof Gen2<?>));
        System.out.println("iOb instanceof Gen<?>: " + (iOb instanceof Gen<?>));
    }
}

class Gen<T> {

    private T object;

    public Gen(T t) {
        object = t;
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

