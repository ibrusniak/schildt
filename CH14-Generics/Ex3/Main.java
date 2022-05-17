
public class Main {

    public static void main(String[] args) {
        
        System.out.println();
        GenericClass gcRaw = new GenericClass(1);
        System.out.println(gcRaw);
        GenericClass<String> gcString = new GenericClass<String>("String0");
        System.out.println(gcString);

        gcRaw = gcString;
        System.out.println(gcRaw);

        // Note: Main.java uses unchecked or unsafe operations.
        // Note: Recompile with -Xlint:unchecked for details.
        GenericClass<Integer> gcInteger = new GenericClass(1);

        gcInteger.showType();
        gcRaw.showType();
    }
}


