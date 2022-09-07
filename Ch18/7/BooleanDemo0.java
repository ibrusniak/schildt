import java.io.PrintStream;

public class BooleanDemo0 {

    public static void main(String[] args) {

        PrintStream ps = System.out;

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);

        ps.println(b1);        
        ps.println(b2);

        ps.println(b1.compareTo(b2)); // 1
        ps.println(b2.compareTo(b1)); // -1

        ps.println(Boolean.valueOf("true")
            .compareTo(Boolean.valueOf(true))); // 0
        
        ps.println("p1.equals(b2): " + b1.equals(b2));  // false
        ps.println("Boolean.valueOf(\"true\").equals(Boolean.valueOf(true)): "
            + Boolean.valueOf("true")
                .equals(Boolean.valueOf(true)));  // true

        Boolean _true = Boolean.valueOf(true);
        Boolean _false = Boolean.valueOf(false);

        ps.println("true AND true : " + Boolean.logicalAnd(true, true));
        ps.println("true AND false : " + Boolean.logicalAnd(true, false));
        ps.println("false AND false : " + Boolean.logicalAnd(false, false));

        ps.println();

        ps.println("true XOR true : " + Boolean.logicalXor(true, true));
        ps.println("false XOR false : " + Boolean.logicalXor(false, false));
        ps.println("true XOR false : " + Boolean.logicalXor(true, false));
        ps.println("false XOR true : " + Boolean.logicalXor(false, true));

        ps.println();
    }
}

