import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;

public class LocaleDemo0 {
    
    public static void main(String[] args) {
        
        Locale[] locales = Locale.getAvailableLocales();

        Consumer printer = x -> System.out.print(x + "  ");

        Arrays.asList(locales).forEach(printer);

        System.out.println("\n\n");

        Field[] fields = Locale.class.getDeclaredFields();

        Arrays.asList(fields).forEach(printer);

        System.out.println("\n");
    }
}
