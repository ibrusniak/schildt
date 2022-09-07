/**
 * TypeSafetyDemo. Demonstrates how we can
 * get run-time error when do not use parametrized
 * class (generic)
 */
public class TypeSafetyDemo {

    public static void main(String[] args) {
        
        NonGen nonGen1 = new NonGen("String argument");
        NonGen nonGen2 = new NonGen(200);
        
        nonGen1.showType();
        nonGen2.showType();
        
        // We have to use explicit type casting
        String s = (String)nonGen1.getO();
        System.out.println(s);

        NonGen nonGen3 = new NonGen(2.44f);
        nonGen3 = nonGen2;

        // Notice! We can compile this file but here will occurs
        // run-time exception (java.lang.ClassCastException)
        Float f = (Float)nonGen3.getO();
        System.out.println(f);
    }
}

/**
 * NonGen - class uses Object variable "o" and can
 * store any type of data. But there is some potential
 * problem when go this way.
 */
class NonGen {

    private Object o;

    NonGen(Object o) {
        this.o = o;
    }

    public Object getO() {
        return o;
    }

    public void showType() {
        System.out.println("Type of o is: "
            + o.getClass().getName());
    }
}

