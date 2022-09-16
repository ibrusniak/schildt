
import java.lang.reflect.Method;

public class ClassDemo1 {

    public static void main(String[] args) {
        
        Class meta = ClassDemo1.class;

        Method[] methods = meta.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
        }
    }
}

