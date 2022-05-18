
public class Main {

    public static void main(String[] args) {
        
        System.out.println(getDouble(new GenericClass<Integer>(10)));
        System.out.println(getDouble(new GenericClass<Float>(40f)));
    }

    public static Double getDouble(GenericClass<?> gc) {
        return gc.getValue().doubleValue();
    }
}

class GenericClass<T extends Number> {

    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}


