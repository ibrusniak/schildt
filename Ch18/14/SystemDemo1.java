import java.util.Map;
import java.util.Properties;

public class SystemDemo1 {
    
    public static void main(String[] args) {

        Map<String, String> env = System.getenv();

        env.forEach((k, v) -> System.out.printf("{%s}:{%s}%n", k, v));
        System.out.print("\n".repeat(3));
        Properties props = System.getProperties();
        props.forEach((k, v) -> System.out.printf("{%s}:{%s}%n", k, v));
    }
}

