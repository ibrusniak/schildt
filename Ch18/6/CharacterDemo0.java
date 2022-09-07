import java.io.PrintStream;

public class CharacterDemo0 {

    public static void main(String[] args) {

        PrintStream ps = System.out;

        ps.println("Character.MIN_CODE_POINT: " + Character.MIN_CODE_POINT);
        ps.println("Character.MAX_CODE_POINT: " + Character.MAX_CODE_POINT);
        
        ps.println("Character.MIN_RADIX: " + Character.MIN_RADIX);
        ps.println("Character.MAX_RADIX: " + Character.MAX_RADIX);
        
        ps.println("Character.MIN_SURROGATE: " + Character.MIN_SURROGATE);
        ps.println("Character.MAX_SURROGATE: " + Character.MAX_SURROGATE);
        
        ps.println("Character.MIN_HIGH_SURROGATE: " + Character.MIN_HIGH_SURROGATE);
        ps.println("Character.MAX_HIGH_SURROGATE: " + Character.MAX_HIGH_SURROGATE);

        ps.println("Character.MIN_LOW_SURROGATE: " + Character.MIN_LOW_SURROGATE);
        ps.println("Character.MAX_LOW_SURROGATE: " + Character.MAX_LOW_SURROGATE);

        ps.println("Character.MIN_VALUE: " + Character.MIN_VALUE);
        ps.println("Character.MAX_VALUE: " + Character.MAX_VALUE);

        ps.println("Character.MIN_SUPPLEMENTARY_CODE_POINT: " + Character.MIN_SUPPLEMENTARY_CODE_POINT);
    }
}

