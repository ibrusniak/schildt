import java.util.Properties;
import java.util.Enumeration;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PropertiesDemo0 {
    
    public static void main(String[] args) {

        Properties systemProperties = System.getProperties();

        Enumeration names = systemProperties.propertyNames();

        Iterator namesIterator = names.asIterator();

        while (namesIterator.hasNext()) {
            String propertyName = (String)namesIterator.next();
            System.out.println(String.format("%s: [%s]",
                propertyName, systemProperties.get(propertyName)));
        }

        try {
            FileOutputStream fout = new FileOutputStream("properties.xml");
            systemProperties.storeToXML(fout, "properties");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


