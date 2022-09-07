import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormatterDemo2 {

    public static void main(String[] args) {

        // %a, %A - floating point hexadecimal
        prn("%a", 2.3);
        // output: 0x1.2666666666666p1
        prn("%A", 2.3);
        // output: 0X1.2666666666666P1

        // %b, %B - boolean
        prn("%b", false);
        // output: false
        prn("%B", true);
        // output: TRUE

        // %c, %C - character
        prn("%c", 'f');
        // output: f
        prn("%C", 'f');
        // output: F
        
        // %d - decimal integer
        prn("%d", 200);
        // output: 200
        
        // %h, %H - hash code of the argument
        prn("%h", 200);
        // output: c8
        prn("%H", 200);
        // output: C8
        
        // %e, %E - scientific notation
        prn("%e", 2.4);
        // output: 2.400000e+00
        prn("%E", 2.4);
        // output: 2.400000E+00
        
        // %f - decimal floating point
        prn("%f", 2.3);
        // output: 2.300000
        
        // -- 
        prn("%g", 2.3);
        // output: 2.30000
        
        // -- 
        prn("%G", 2.3);
        // output: 2.30000

        // %o - octal integer
        prn("%o", 9);
        // output: 11

        // %n - insert a new line character
        prn("First line%nSecond line", "");

        // %s, %S - string
        prn("%s", "String value");
        // output: String value

        // %s, %S - string
        prn("%S", "String value");
        // output: STRING VALUE]

        // %t, %T - time and date (single t or T does not work)
        prn2("%tc", Calendar.getInstance());
        // output: Fri Sep 02 17:09:05 EEST 2022

        // %t, %T - time and date (single t or T does not work)
        prn2("%Tc", Calendar.getInstance());
        // output: FRI SEP 02 17:09:05 EEST 2022

        // %x, %X - integer hexadecimal
        prn("%x", 200);
        // output: c8

        prn("%X", 200);
        // output: C8

        // %% - insert a % sign
        prn("%%", "");
        // output: %
    }

    private static <T> void prn(String format, T value) {
        
        Formatter fmt = new Formatter();
        System.out.print("Format string: [" + format + "], value: [" + value
            + "], result: [" + fmt.format(format, value) + "]\n");
        fmt.close();
    }

    private static <T> void prn2(String format, T value) {
        
        Formatter fmt = new Formatter();
        System.out.print("Format string: [" + format + "], result: [" + fmt.format(format, value) + "]\n");
        fmt.close();
    }
}
