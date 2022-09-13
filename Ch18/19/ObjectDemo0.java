
public class ObjectDemo0 {

    public static void main(String[] args) throws Exception {
        
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1);
        System.out.println(o2);
        
        System.out.println(Integer.toHexString(o1.hashCode()));
        System.out.println(Integer.toHexString(o2.hashCode()));
        
        System.out.println();
        
        MyObject mo1 = new MyObject();
        MyObject mo2 = new MyObject();

        System.out.println(mo1);
        System.out.println(mo2);

        System.out.println(Integer.toHexString(mo1.hashCode()));
        System.out.println(Integer.toHexString(mo2.hashCode()));

        MyObject mo3 = mo2.clone();
        System.out.println(mo3);
    }
}

class MyObject extends Object {

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return new MyObject();
    }
}

