
public class Main {

    public static void main(String[] args) {
        
        printParametersType(10);
        printParametersType(3.4);
        printParametersType(true);
        Main.printParametersType(3.14F);
        Main.<String>printParametersType("foo");
        Main.<Object>printParametersType(new Object());

        SomeClass0 s = new SomeClass0();
        s.<Integer>printDoubleValue(20);
        s.printDoubleValue(10D);
    }

    public static <T> void printParametersType(T arg) {
        System.out.println(arg.getClass().getName());
    }
}

class SomeClass0 {

    public <T extends Number> void printDoubleValue(T arg) {
        System.out.println("Double value is: " + arg.doubleValue());
    }
}


