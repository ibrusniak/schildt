
public class Gen<T> {

    private T ob;

    Gen(T o) {
        ob = o;
    }

    public T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Type of T is: "
            + ob.getClass().getName());
    }
}

