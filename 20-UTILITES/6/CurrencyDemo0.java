import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.Set;

public class CurrencyDemo0 {

    public static void main(String[] args) {

        Set<Currency> availableCurrencies
            = Currency.getAvailableCurrencies();
        
        availableCurrencies.stream()
            .map(x -> x.toString())
            .sorted((x, y) -> x.compareTo(y))
            .forEach(x -> System.out.print(x + " "));
        
        System.out.println("\n");

        availableCurrencies.stream()
            .sorted((a, b) -> a.getSymbol().compareTo(b.getSymbol()))
            .forEach(c -> System.out.println(
                c.getNumericCode()
                + " " + c.getCurrencyCode()
                + " " + c.getSymbol()
                + " " + c.getSymbol(Locale.FRANCE)
            ));
    }
}

