
public class ObjectDemo2 {

    public static void main(String[] args) {
        
        MyClass m1 = new MyClass();
        try {
            MyClass m2 = m1.newMyClass();
        } catch (CloneNotSupportedException e) {
            System.out.println(m1.getClass().getName() + " does not support cloning!");
        }

        MyClass2 m21 = new MyClass2();
        MyClass2 m22 = m21.clone();
    }   
}

class MyClass extends Object {

    public MyClass newMyClass() throws CloneNotSupportedException {
        return (MyClass)super.clone();
    }
}

class MyClass2 implements Cloneable {

    protected MyClass2 clone() {
        return new MyClass2();
    }
}

