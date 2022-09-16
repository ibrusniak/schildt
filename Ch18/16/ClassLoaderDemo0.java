import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassLoaderDemo0 {

    public static void main(String[] args) {

        ClassLoader cl = ClassLoader.getSystemClassLoader();

        try {

            Class<?> _class = cl.loadClass("SomeClass");
            Constructor defaultConstructor = _class.getConstructor();
            Object newInstance = defaultConstructor.newInstance();
            Method someMethod = _class.getMethod("someMethod");
            someMethod.invoke(newInstance);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

