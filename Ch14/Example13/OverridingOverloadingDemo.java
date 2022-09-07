/**
 * OverridingOverloadingDemo
 */
public class OverridingOverloadingDemo {

    public static void main(String[] args) {
        
        Parent p = new Child();
        Child ch = new Child();

        p.doSomething("hi");
        ch.doSomething("ch");

        ((Parent)p).doSomething("ololo");
        System.out.println(p);
        System.out.println((Parent)p);
    }
}

class Parent {

    public void doSomething(String str) {
        System.out.print("Parent: ");
        System.out.println(str);
    }
}

class Child extends Parent {

    @Override
    public void doSomething(String str) {
        System.out.print("Child: ");
        System.out.println(str);
    }

    // Compilation error! Method does not override or
    // implement a method from a supertype
    // @Override
    // public void doSomething(Integer str) {
    //     System.out.print("Child: ");
    //     System.out.println(str);
    // }

    // Overloading - normal
    public boolean doSomething() {
        return false;
    }
}


