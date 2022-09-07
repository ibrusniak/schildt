/**
 * BridgeDemo. Demonstrates situation that
 * creates a bridge method.
 */
public class BridgeDemo {

    public static void main(String[] args) {
        
        // Create a Gen2 object for String
        Gen2 strOb2 = new Gen2("Generic test");
        System.out.println(strOb2.getOb());
    }
}

class Gen<T> {

    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class Gen2 extends Gen<String> {

    public Gen2(String ob) {
        super(ob);
    }

    // A String-specific override of getob()
    public String getOb() {
        System.out.println("You called String getob(): ");
        return ob;
    }
}


