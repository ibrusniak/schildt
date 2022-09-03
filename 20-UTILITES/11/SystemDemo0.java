
import java.io.FileWriter;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SystemDemo0 {

    public static void main(String[] args) {

        Map<String, String> environment = System.getenv();
        Set<Map.Entry<String, String>> set
            = environment.entrySet();
        
        try (FileWriter fw = new FileWriter("environment.log")) {
            
            for (Entry<String,String> e : set) {
                fw.write(String.format("%s = {%s}%n", e.getKey(), e.getValue()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

