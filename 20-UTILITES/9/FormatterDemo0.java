import java.util.Formatter;

public class FormatterDemo0 {

    public static void main(String[] args) {
        
        Formatter formatter = new Formatter();
        formatter.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
        System.out.println(formatter.toString());
        Appendable appendable = formatter.out();
        System.out.println(appendable.toString());
        formatter.close();

    }
}

