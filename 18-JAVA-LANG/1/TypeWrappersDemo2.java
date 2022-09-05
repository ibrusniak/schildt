
public class TypeWrappersDemo2 {
    
    public static void main(String[] args) {
        
        line();

        println(TypeWrappersDemo2.<Integer>max(2, 3, 4, 5));
        println(TypeWrappersDemo2.<Double>max(2d, 3d, 4d, 5d));
        println(TypeWrappersDemo2.<Float>max(2f, 3f, 4f, 5f));
        
        println(TypeWrappersDemo2.<Integer>max(Integer.valueOf(2),
            Integer.valueOf(3)));

        line();

        // java.lang.ClassCastException
        // println((TypeWrappersDemo2.<Integer>max(2, 3, 4, 5)).getClass());
    }

    @SuppressWarnings("unchecked")
    private static <T extends Number> T max(T... values) {

        Double max = .0;
        for (T t : values) {
            if (max < t.doubleValue())
                max = t.doubleValue();
        }
        return (T)max; // Dangerous method
    }

    private static void println(Object o) {
        System.out.println(o);
    }

    private static void line() {
        System.out.println();
    }
}


