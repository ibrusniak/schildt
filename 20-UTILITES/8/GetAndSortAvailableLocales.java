import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Locale;

import javax.swing.text.html.FormSubmitEvent;

public class GetAndSortAvailableLocales {
    
    public static void main(String[] args) {
     
        TreeSet<Locale> availableLocales = new TreeSet<>((l1, l2)
            -> l1.toLanguageTag().compareTo(l2.toLanguageTag()));
        
        Locale[] arrayOfAvailableLocales = Locale.getAvailableLocales();

        for (Locale locale : arrayOfAvailableLocales) {
            availableLocales.add(locale);
        }

        final String fileName = "availableLocales.txt";
        
        try (PrintStream ps = new PrintStream(fileName)) {
            availableLocales.forEach(l -> ps.println(l.toLanguageTag()));
        } catch (Exception e) {
            System.out.println("Coudn't write file " + fileName + "\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
}



