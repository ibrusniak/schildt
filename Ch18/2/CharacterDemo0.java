
public class CharacterDemo0 {

    public static void main(String[] args) {
        
        println("Character.BYTES: " + Character.BYTES);
        println("Character.MAX_RADIX: " + Character.MAX_RADIX);
        println("Character.MIN_RADIX: " + Character.MIN_RADIX);
        println("Character.MIN_VALUE: " + Character.MIN_VALUE);
        println("Character.MAX_VALUE: " + Character.MAX_VALUE);

        line();
        println(Character.isDigit('0'));
        println(Character.isDigit('A'));
        
        line();
        println(Character.isLetter('A'));
        println(Character.isLetterOrDigit('A'));
        
        line();
        println(Character.isSpaceChar(' '));    // true
        println(Character.isSpaceChar('\t'));   // false
        println(Character.isSpaceChar('\n'));   // false
        
        line();
        println(Character.isWhitespace('\t'));  // true
        println(Character.isWhitespace('\n'));  // true
        println(Character.isWhitespace(' '));   // true
        line();
    }

    private static void println(Object o) {
        System.out.println(o);
    }

    private static void line() {
        System.out.println();
    }
}

