import javax.imageio.plugins.tiff.GeoTIFFTagSet;

/**
 * CastingDemo1
 */
public class CastingDemo1 {

    public static void main(String[] args) {
        
        GenericParent<Integer> parentInteger = new GenericParent<Integer>(10);
        GenericParent<Double> parentDouble = new GenericParent<Double>(10.5);

        GenericChild1<Integer> childInteger = new GenericChild1<Integer>(20);
        GenericChild1<Double> childDouble = new GenericChild1<Double>(20.5);

        System.out.println();

        parentInteger.print();
        parentDouble.print();

        System.out.println();
        
        childInteger.print();
        childDouble.print();

        System.out.println();

        ((GenericParent<Integer>)childInteger).print();
    }
}

class GenericParent<T> {
    
    protected T ob;

    public GenericParent(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void print() {
        System.out.println(this + " " + ob);
    }
}

class GenericChild1<T> extends GenericParent<T> {

    public GenericChild1(T ob) {
        super(ob);
    }

    @Override
    public void print() {
        System.out.println(this + " " + ob);
    }
}

