
public class Stats<T extends Number> {

    private T[] array;

    public Stats(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double average() {
        double result = 0D;
        for (T d : array) {
            result += d.doubleValue();
        }
        result /= array.length;
        return result;
    }

    public boolean sameAverage(Stats<?> object) {
        return average() == object.average();
    }
}


