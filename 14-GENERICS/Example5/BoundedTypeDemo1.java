/**
 * BoundedTypeDemo1. Demonstrates bounded
 * type argument
 */
public class BoundedTypeDemo1 {

    public static void main(String[] args) {
        
        Stats<Integer> integerStats
            = new Stats<Integer>(new Integer[]{2, 3, 4});
        Stats<Float> floatStats
            = new Stats<Float>(new Float[]{2f, 3f, 4f});
        Stats<Double> doubleStats
            = new Stats<Double>(new Double[]{2.0, 3.0, 4.0});

        integerStats.printAverage();
        floatStats.printAverage();
        doubleStats.printAverage();
    }
}

class Stats<T extends Number> {

    private T[] container;

    public Stats(T[] container) {
        this.container = container;
    }

    public Double getAverage() {
        Double sum = 0d;
        for (T item : container) {
            sum += item.doubleValue();
        }
        return sum / container.length;
    }

    public void printAverage() {
        System.out.println(this + " average: " + getAverage());
    }
}

