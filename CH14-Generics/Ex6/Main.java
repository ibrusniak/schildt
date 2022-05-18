
public class Main {

    public static void main(String[] args) {

        ClassWithTwoTypeParameters<Integer, String> cttp =
            new ClassWithTwoTypeParameters<Integer, String>(200, "String 200");
        
        cttp.showTypes();
        int i = cttp.getOb1();
        System.out.println("i value: " + i);
        String s = cttp.getOb2();
        System.out.println("s value: " + s);
    }
}



