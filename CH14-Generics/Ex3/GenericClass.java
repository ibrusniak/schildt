
public class GenericClass<T> {

    private T value;

    public GenericClass(T v) {
        value = v;
    }

    public void showType() {
        System.out.printf("%s : %s\n", this, value.getClass().getName());
    }
}


