import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapInterfaceDemo2 {

    record Salary(Integer value) {
    }

    public static void main(String[] args) {
        HashMap<String, Salary> salaries
            = new HashMap<>();
        
        salaries.put("Jack", new Salary(1500));
        salaries.put("John", new Salary(3500));
        salaries.put("Soosan", new Salary(2000));

        println(salaries);
        salaries.forEach((k, v)
            -> salaries.put(k, new Salary(v.value() + 200)));
        println(salaries);
    }

    private static <E> void println(E object) {
        System.out.println(object);
    }
}

