import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDemo0 {
    
    public static void main(String[] args) {

        Class cl = new Object().getClass();

        System.out.println("toString: " + cl);
        System.out.println("simple name: " + cl.getSimpleName());
        System.out.println("name: " + cl.getName());

        System.out.println("\nMethods:\n");
        Method[] methods = cl.getMethods();
        for (Method method : methods)
            System.out.println(method);
        
        System.out.println("\nFields:\n");
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields)
            System.out.println(field);

        System.out.println("\n".repeat(2));

        Class reflection = MyOwnClass.class;

        System.out.println("MyOwnClass:\n");
        System.out.println("Fields:\n");
        Field[] f = reflection.getFields();
        for (Field field : f) {
            System.out.println(field);
        }

        System.out.println("Methods:\n");
        Method[] m = reflection.getMethods();
        for (Method method : m) {
            System.out.println(method);
        }

        System.out.println("Declared methods:");
        Method[] declaredMethods = reflection.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        System.out.println("\n");

        try {
            Method privateDeclaredMethod = reflection.getDeclaredMethod("somePrivateMethod");
            privateDeclaredMethod.invoke(new Object());
        } catch (NoSuchMethodException e) {
            System.out.println("No such method!");
        } catch (Exception e) {
            System.out.println("Illegal access!\n");
            e.printStackTrace();
        }
    }
}

class MyOwnClass {

    private Object obj;
    private int someField;

    public MyOwnClass() {}

    public MyOwnClass(Object obj) {
        setObj(obj);
    }

    MyOwnClass(Object obj, int someField) {
        setObj(obj);
        setSomeField(someField);
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public int getSomeField() {
        return someField;
    }

    public void setSomeField(int someField) {
        this.someField = someField;
    }

    private void somePrivateMethod() {
        System.out.println("Called some private method");
    }
}

