
public class Main {

    public static void main(String[] args) {
        
        NonGenericEquivalent ngeInteger = new NonGenericEquivalent(10);
        NonGenericEquivalent ngeString = new NonGenericEquivalent("String 200");

        ngeInteger.showType();
        ngeString.showType();

        // error: incompatible types: Object cannot be converted to Integer
        // Integer i = ngeInteger.getValue();
        // --> Notice that a cast is necessary
        Integer i0 = (Integer)(ngeInteger.getValue());
        System.out.println("i0 value: " + i0);
        
        String str = (String)(ngeString.getValue());
        System.out.println("str value: " + str);

        // This compiles, but is conceptually wrong!
        ngeInteger = ngeString;
        Integer i1 = (Integer)(ngeInteger.getValue());
    }
}




