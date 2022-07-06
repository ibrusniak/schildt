/**
 * GenericClassHierarchiesDemo2. A subclass can add its own
 * type parameters.
 */
public class GenericClassHierarchiesDemo2 {

    public static void main(String[] args) {
        
        Gen<Double> gen1 = new Gen2<Double, Integer>(200.3, 34);
        System.out.println(gen1.getOb());
        System.out.println(((Gen2<Double, Integer>)gen1).getOv());  
    }
}

class Gen<T> {

    private T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class Gen2<T, V> extends Gen<T> {

    private V ov;

    public Gen2(T ob, V ov) {
        super(ob);
        this.ov = ov;
    }

    public V getOv() {
        return ov;
    }
}


