/**
 * OverridingOverloadingDemo2. Demonstrates standard
 * overloading and overriding.
 */
public class OverridingOverloadingDemo2 {

    public static void main(String[] args) {
        
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        obj1.printSomething();
        obj2.printSomething();
        
        // Compilation error.
        // method printSomething in class Parent
        // cannot be applied to given types
        // obj2.printSomething("Hello");

        Child obj3 = new Child();
        obj3.printSomething("str"); // Normal
    }
}

class Parent {

    public void printSomething() {
        System.out.println("Parrent.printSomething");
    }
}

class Child extends Parent {
    
    @Override
    public void printSomething() {
        System.out.println("Child.printSomething");
    }

    // Overloading
    public void printSomething(String str) {
        System.out.println("Child.printSomething(String)");
    }
}


