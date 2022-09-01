import java.util.Calendar;
import java.util.Locale;

public class LocaleDemo1 {
    
    public static void main(String[] args) {
        
        Calendar date = Calendar.getInstance();
        
        Printer printer
            = x -> {
                if (x instanceof Calendar) {
                    System.out.println(
                    String.format("%1$tB %1$tA %1$tY %1$td %1$tH:%1$tM:%1$tS", x));
                } else {
                    System.out.println(x);
                }
            };
            
        printer.print(date);

        Locale defaultLocale = Locale.getDefault();

        printer.print(defaultLocale.getCountry());
        printer.print(defaultLocale.getLanguage());
        
        Locale.setDefault(new Locale("uk", "UA"));

        printer.print(date);

        System.out.println(
                String.format(Locale.ENGLISH, "todays day is: %1$tA", Calendar.getInstance()));
        
        System.out.println(
                String.format(Locale.ITALY, "todays day is: %1$tA", Calendar.getInstance()));
        
        System.out.println(
                String.format(Locale.GERMAN, "todays day is: %1$tA", Calendar.getInstance()));
    }
}

interface Printer {
    public void print(Object x);
}

