
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo0 {
    
    public static void main(String[] args) {
        
        // Load the default bundle.
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

        System.out.println("English version: ");
        System.out.println("String for Title key: "
            + rd.getString("title"));
        
        System.out.println("String for StopText key: "
            + rd.getString("StopText"));
        
        System.out.println("String for StartText key: "
            + rd.getString("StartText"));

        System.out.println();

        // Load the German bundle.
        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        System.out.println("German version: ");
        System.out.println("String for Title key: "
            + rd.getString("title"));
        
        System.out.println("String for StopText key: "
            + rd.getString("StopText"));
        
        System.out.println("String for StartText key: "
            + rd.getString("StartText"));
    }
}

public class SampleRB extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        
        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "My Program";
        
        resources[1][0] = "StopText";
        resources[1][1] = "Stop";

        resources[2][0] = "StartText";
        resources[2][1] = "Start";

        return resources;
    }
}

public class SampleRB_de extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        
        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "Mein Programm";
        
        resources[1][0] = "StopText";
        resources[1][1] = "Anschlag";

        resources[2][0] = "StartText";
        resources[2][1] = "Anfang";

        return resources;
    }
}


