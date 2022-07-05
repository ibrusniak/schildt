/**
 * WildcardArgumentDemo1. Demonstrates ho to use wildcard argument.
 */
public class WildcardArgumentDemo1 {

    public static void main(String[] args) {
        
        Stats<Double> statsDouble
            = new Stats<Double>(new Double[]{6.0, 2.0, 10d});
        Stats<Integer> statsInteger
            = new Stats<Integer>(new Integer[]{2, 10, 6});
        System.out.println(statsDouble.average());
        System.out.println(statsInteger.average());
        System.out.println(statsInteger.sameAvg(statsDouble));
        System.out.println(statsDouble.sameAvg(statsInteger));
    }
}

class Stats<T extends Number> {

    private T[] array;

    public Stats(T[] array) {
        this.array = array;
    }

    public double average() {
        double sum = 0.0;
        for (T i : array) {
            sum += i.doubleValue();
        }
        return sum / array.length;
    }

    public boolean sameAvg(Stats<?> stats) {
        return average() == stats.average();
    }
}


