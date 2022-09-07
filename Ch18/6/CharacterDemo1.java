import java.io.PrintStream;

public class CharacterDemo0 {

    public static void main(String[] args) {

        PrintStream ps = System.out;

        ps.println("MIN_RADIX: " + Character.MIN_RADIX);
        ps.println("MAX_RADIX: " + Character.MAX_RADIX);

        for (int i = 0; i <= 15; i++) {
            ps.print(Character.forDigit(i, 16) + " ");
        }
        ps.println();

        for (int i = 0; i <= 36; i++) {
            ps.print(Character.forDigit(i, 36) + " ");
        }
        ps.println();
    }
}

