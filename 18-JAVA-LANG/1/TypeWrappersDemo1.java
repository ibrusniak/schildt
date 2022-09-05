
public class TypeWrappersDemo0 {
    
    public static void main(String[] args) {
        
        Float f = Float.valueOf("2.34");
        Double d = Double.valueOf(22.3d);

        println(f);
        println(d);

        f = Float.valueOf("22.3");

        println(f.hashCode());  // 1102210662
        println(d.hashCode());  // -1929740287

        println(Float.floatToIntBits(f));       // 1102210662
        println(Double.doubleToLongBits(d));    // 4626970109662776525

        println(f.intValue());  // 22
        println(Float.valueOf(22.5f).intValue());   // 22
        println(Float.valueOf(22.6f).intValue());   // 22
    
        println(0.5 + 0.1); // 0.6
        println(0.1 + 0.2); // 0.30000000000000004

        println("0.1 + 0.2 == 0.3: " + (0.1 + 0.2 == 0.3)); // false
        
        println(Double.valueOf("0.3")); // 0.3

        d = Double.valueOf(1d) / Double.valueOf(0d);
        Double g = 1d / 0d;
        println(d);   // Infinity
        println(g);   // Infinity
        println(Double.isInfinite(d));  // true
        println(Double.isNaN(2.3e200d * Integer.MAX_VALUE));    // false

        line();

        println("Float max exponent: " + Float.MAX_EXPONENT);
        println("Float min exponent: " + Float.MIN_EXPONENT);
        println("Float max value: " + Float.MAX_VALUE);

        line();

        println("Double max exponent: " + Double.MAX_EXPONENT);
        println("Double min exponent: " + Double.MIN_EXPONENT);
        println("Double max value: " + Double.MAX_VALUE);

        line();

        println("Float.NEGATIVE_INFINITY: " +  Float.NEGATIVE_INFINITY);
        println("Float.POSITIVE_INFINITY: " + Float.POSITIVE_INFINITY);
        println("Float.NaN: " + Float.NaN);

        line();

        println(Double.POSITIVE_INFINITY == Float.POSITIVE_INFINITY); // true!
        println(Double.NaN == Float.NaN); // false!
        println(Double.NaN);

        println(Float.valueOf(Float.NaN) instanceof Float); // true
        println(Double.valueOf(Double.NaN) instanceof Double); // true

        line();
        println("Double.mit(2.2, 2.1): " + Double.min(2.2, 2.1));
    }
    
    private static void println(Object o) {
        System.out.println(o);
    }

    public static void line() {
        System.out.println();
    }
}

