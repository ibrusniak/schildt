

public class Main {

    public static void main(String[] args) {
        
        ParametrizedClass<C3> p1 = new ParametrizedClass<>(new C3());
        ParametrizedClass<C2> p2 = new ParametrizedClass<>(new C2());

        printType(p1);
        printType(p2);
    }

    public static void printType(ParametrizedClass<? super C3> arg) {
        System.out.println(arg.getObject().getClass().getName());
    }
}

class ParametrizedClass<T> {

    private T object;

    public ParametrizedClass(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}

class C0 {}

class C1 extends C0 {}

class C2 extends C1 {}

class C3 extends C2 {}


