
import java.util.Properties;

/**
 * Use chcp 65001 to switch your CMD or Powershell to
 * UTF-8 (65001) encodint. Without this action cyryllic
 * symbols will not print to stdout properly...
 * 
 * System.setProperty(key, value) - does not change CMD or
 * Powershell encoding...
 */
public class CodePageDemo0 {
    
    public static void main(String[] args) throws Exception {
        printProperties();
        System.out.println("Cyryllic + Кириллица + ЁЭэ + ЇїЄє");
        System.setProperty("sun.stdout.encoding", "65001");
        printProperties();
        System.out.println("Cyryllic + Кириллица + ЁЭэ + ЇїЄє");
    }
    
    private static void printProperties() {
        System.out.println();
        Properties pr = System.getProperties();
        pr.forEach((k, v) -> {
            if (k.toString().matches(".*encoding.*"))
            System.out.printf("%s=%s\n", k, v);
        });
        System.out.println();
    }
}

