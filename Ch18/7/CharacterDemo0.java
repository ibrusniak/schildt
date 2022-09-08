import java.io.PrintStream;

public class CharacterDemo0 {
    public static void main(String[] args) throws Exception {
        printConstantsToTheStream(System.out);
        printConstantsToTheStream(new PrintStream("character_constantx.out"));
    }
    
    private static void printConstantsToTheStream(PrintStream stream) {
        stream.println();
        stream.printf("Character.MIN_VALUE: HEX[%H]%n", Character.MIN_VALUE);
        stream.printf("Character.MAX_VALUE: HEX[%H]%n", Character.MAX_VALUE);
        stream.println();
        stream.printf("Character.BYTES: DEC[%1$d] HEX[%1$H]%n", Character.BYTES);
        stream.printf("Character.SIZE: DEC[%1$d] HEX[%1$H]%n", Character.SIZE);
        stream.println();
        stream.printf("Character.MIN_CODE_POINT:                DEC[%1$d] HEX[%1$H]%n", Character.MIN_CODE_POINT);
        stream.printf("Character.MIN_SUPPLEMENTARY_CODE_POINT:  DEC[%1$d] HEX[%1$H]%n", Character.MIN_SUPPLEMENTARY_CODE_POINT);
        stream.printf("Character.MAX_CODE_POINT:                DEC[%1$d] HEX[%1$H]%n", Character.MAX_CODE_POINT);
        stream.println();
        stream.printf("Character.MIN_SURROGATE:         HEX[%H]%n", Character.MIN_SURROGATE);
        stream.printf("Character.MIN_HIGH_SURROGATE:    HEX[%H]%n", Character.MIN_HIGH_SURROGATE);
        stream.printf("Character.MAX_HIGH_SURROGATE:    HEX[%H]%n", Character.MAX_HIGH_SURROGATE);
        stream.printf("Character.MIN_LOW_SURROGATE:     HEX[%H]%n", Character.MIN_LOW_SURROGATE);
        stream.printf("Character.MAX_LOW_SURROGATE:     HEX[%H]%n", Character.MAX_LOW_SURROGATE);
        stream.printf("Character.MAX_SURROGATE:         HEX[%H]%n", Character.MAX_SURROGATE);
        stream.println();
    }
}

