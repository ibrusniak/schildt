/**
 * InstanceofDemo. "instanceof" determines if an object is an
 * instance of a class. It returns true if an object is of the specified
 * type or can be cast to the specified type.
 */
public class InstanceofDemo {

    public static void main(String[] args) {
        
        Integer i = 20;
        Double j = 3.4;
        System.out.printf("i is%s instance of Integer\n", i instanceof Integer ? "" : " not");
        System.out.printf("j is%s instance of Number\n", j instanceof Number ? "" : " not");

        System.out.println();
        
        System.out.println(new Object() instanceof Integer);
        System.out.println(Integer.valueOf(200) instanceof Object);
        System.out.println(Integer.valueOf(200) instanceof Object);

        System.out.println();
        
        System.out.println(new MyClass() instanceof MyInterface);
    }
}

interface MyInterface {
    public void doSomething();
}

class MyClass implements MyInterface {
    public void doSomething() {}
}

