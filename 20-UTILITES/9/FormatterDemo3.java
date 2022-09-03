import java.util.Formatter;

public class FormatterDemo0 {

    public static void main(String[] args) {
        
        System.out.println(new Formatter().format("%+f", -2.34));
        System.out.println(new Formatter().format("%+e", 2.34));
        System.out.println(new Formatter().format("%+E", -2.34));
    }
}

