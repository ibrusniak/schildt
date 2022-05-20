
public class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] values;

    public MyClass(T[] values) {
        this.values = values;
    }

    public void setValues(T[] values) {
        this.values = values;
    }

    public T[] getValues() {
        return values;
    }

    public T min() {

        T min = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            if (min.compareTo(values[i + 1]) > 0) {
                min = values[i + 1];
            }
        }
        return min;
    }

    public T max() {

        T max = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            if (max.compareTo(values[i + 1]) < 0) {
                max = values[i + 1];
            }
        }
        return max;
    }
}


