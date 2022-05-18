
public class ClassWithTwoTypeParameters<T, V> {

    private T ob1;
    private V ob2;

    public ClassWithTwoTypeParameters(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void showTypes() {
        System.out.printf("\nType of T is: %s\nType of V is: %s\n",
            ob1.getClass().getName(), ob2.getClass().getName());
    }
}


