
public class TypeWrappersDemo0 {
    
    public static void main(String[] args) {
        
        int a = 100;
        int b = 100;

        int c, d = 40;

        println(d);

        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);

        println("a == b: " + (a == b));     // True
        println("i1 == i2: " + (i1 == i2)); // True

        println(i1.hashCode()); // 100
        println(i2.hashCode()); // 100

        println(i1.equals(i2)); // true

        i1 = 200;
        println(i1.equals(i2)); // false
        i2 = 200;
        println(i1.equals(i2)); // true
    }
    
    private static void println(Object o) {
        System.out.println(o);
    }
}
