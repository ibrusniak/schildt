import java.util.Formatter;

public class FormatterDemo4 {
    
    public static void main(String[] args) {

        // A precision specifier can be applied to the
        // %f, %e, %g, and %s format specifiers.
        double d = 2223.344;
        println("%f", d);           // [2223.344000]
        println("%20.2f", d);       // [             2223.34]
        println("%20.10f", d);      // [     2223.3440000000]
        println("%020.10f", d);     // [000002223.3440000000]

        // Flag '-' - left justification
        println("%-20.10f", d);      // [2223.3440000000     ]

        // Flag ' ' (space) - positive numeric output is preceded
        // by a space
        println("% 20.10f", d);      // [     2223.3440000000]

        // Flag '+' - positive numeric output is preceded
        // by a + sign
        println("%+20.10f", d);      // [    +2223.3440000000]
        
        // Flag ',' - numeric values including gruping separator
        println("%,20.10f", d);         // [    2,223.3440000000]
        println("%,20d", 99999999);   // [          99,999,999]
        println("%-,20d", 99999999);   // [99,999,999          ]
        
        // Flag '(' - negative numeric values are enclosed within
        // parentheses        
        println("%(20d", 5);   // [                   5]
        println("%(20d", -5);   // [                 (5)]

        System.out.println();

        String s1 = "java.util.Formatter is great thing!";
        String s2 = "You can use it to justificate strings!";
        println("%s", s1);
        println("%s", s2);
        println("%60s", s1);
        // [                         java.util.Formatter is great thing!]
        println("%60s", s2);
        // [                      You can use it to justificate strings!]
        println("%60.10s", s1);
        // [                                                  java.util.]
    }

    private static <T> void println(String f, T v) {
        Formatter fmt = new Formatter();
        System.out.println(
            String.format("Format [%s], value [%s], result [%s]",
                f, v, fmt.format(f, v)));
        fmt.close();
    }
}
