
public class Main {

    public static void main(String[] args) {
        
        printWrappersValueClassName(Wrapper.from(2));
        printWrappersValueClassName(Wrapper.from(4f));
        printWrappersValueClassName(Wrapper.from(3.0));
        printWrappersValueClassName(Wrapper.from("string literal"));
    }

    private static void printWrappersValueClassName(Wrapper<?> wrapper) {
        System.out.println(wrapper.getValue().getClass().getName());
    }
}

class Wrapper<T> {

    T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public static <T> Wrapper<T> from(T value) {
        return new Wrapper<T>(value);
    }

    public T getValue() {
        return value;
    }
}


