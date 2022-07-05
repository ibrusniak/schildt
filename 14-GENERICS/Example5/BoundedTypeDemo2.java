/**
 * BoundedTypeDemo2. Demonstrates how to use bounded type parameter
 */
public class BoundedTypeDemo2 {

    public static void main(String[] args) {

        MyClass1 myClass1 = new MyClass1();
        MyClass1 myClass2 = new MyClass2();
        myClass1.printInfo();
        myClass2.printInfo();

        Generic1<MyClass1> generic1 = new Generic1<MyClass1>();
        Generic1<MyClass2> generic2 = new Generic1<MyClass2>();
    }
}

class MyClass1 {

    public void printInfo() {
        System.out.println(this);
    }
}

class MyClass2 extends MyClass1 {}

class Generic1<T extends MyClass1> {}

