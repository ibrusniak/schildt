
public class GenericClassWithBoundedTypeParameter<T extends Number> {

    T[] array;

    public GenericClassWithBoundedTypeParameter(T[] array) {
        this.array = array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Double average() {
        Double result = 0d;
        for (T item : array) {
            result += item.doubleValue();
        }
        result /= array.length;
        return result;
    }
}


