/**
 * RawTypeDemo1. Demostrates raw type.
 */
public class RawTypeDemo1 {

    public static void main(String[] args) {
        
        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generic test");

        // Create a raw-type Gen object and give it a Double value
        Gen raw = new Gen(Double.valueOf(98.22));

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        // The folowing cast causes a run-time error!
        // int i = (Integer) raw.geob(); // run-time error

        // This assignment overrides type safety.
        strOb = raw; // OK, but potentially wrong.
        // String str = strOb.getOb(); // run-time error
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

