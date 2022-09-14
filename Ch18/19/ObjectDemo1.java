
public class ObjectDemo0 {

    public static void main(String[] args) {
        
        MyClass1 mc1 = new MyClass1();

        try {
            MyClass1 mc2 = mc1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        MyClass2 mc21 = new MyClass2();
        MyClass2 mc22 = mc21.clone();

        System.out.println(mc21);
        System.out.println(mc22);
    }
}

class MyClass1 extends Object {

    @Override
    protected MyClass1 clone() throws CloneNotSupportedException {
        return (MyClass1)super.clone();
    }
}

class MyClass2 extends Object implements Cloneable {

    protected MyClass2 clone() {
        return new MyClass2();
    }
}

