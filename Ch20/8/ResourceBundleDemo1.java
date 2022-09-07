
import java.util.ResourceBundle;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.ListResourceBundle;
import java.util.Locale;

public class ResourceBundleDemo1 {
    
    public static void main(String[] args) {
        
        System.out.println(Locale.getDefault().toLanguageTag());

        ArrayList<Locale> locales = new ArrayList<>();

        locales.add(Locale.getDefault());
        locales.add(new Locale("de"));
        locales.add(new Locale("ru"));
        locales.add(new Locale("uk"));

        String fileName = "resourcesAvailable.txt";

        try (PrintStream stream = new PrintStream(fileName, "UTF-8")) {

            locales.forEach(locale -> {
            
                String s = String.format("Locale %s, resource %s",
                    locale.toLanguageTag(),
                    ResourceBundle.getBundle("Resources", locale).getString("banner"));
                stream.println(s);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Resources extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            new Object[] { "banner", "This is banner" }
        };
    }
}

public class Resources_de extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            new Object[] { "banner", "Das ist Banner" }
        };
    }
}

public class Resources_uk extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            new Object[] { "banner", "Це банер" }
        };
    }
}

public class Resources_ru extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            new Object[] { "banner", "Это баннер" }
        };
    }
}


