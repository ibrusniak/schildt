import java.util.Calendar;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.io.PrintStream;
import java.sql.Date;

public class FormatterDemo0 {

    public static void main(String[] args) {
        
        final String fileName = "FormatterDemo1Output.txt";
        PrintStream ps = null;

        try {
            ps = new PrintStream(fileName, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        Formatter fmt = new Formatter(ps);

        fmt.format("This is format-string! Without any argument.\n");
        fmt.format("Это форматная строка! Без какого-либо аргумента. ЁЭ - особенные символы.\n");
        fmt.format("Це форматний рядок! Без будь-якого аргументу! ЇЄ - особливі символи.\n");

        String dateTimeFormat = "[%1$tY, %1$td, %1$tB %1$tA %1$tH:%1$tM:%1$tS]\n";

        try {

            fmt.format(Locale.getDefault(), dateTimeFormat, Calendar.getInstance());
            fmt.format(new Locale("ru"), dateTimeFormat, Calendar.getInstance());
            fmt.format(new Locale("uk"), dateTimeFormat, Calendar.getInstance());
            fmt.format(new Locale("de"), dateTimeFormat, Calendar.getInstance());
            fmt.format(new Locale("ja"), dateTimeFormat, Calendar.getInstance());
            fmt.format(new Locale("ki"), dateTimeFormat, Calendar.getInstance());
        } catch (IllegalFormatException e) {
            fmt.format("\n%s\n\n", e);
        }

        fmt.close();
    }
}

