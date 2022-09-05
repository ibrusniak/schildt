import java.io.FileOutputStream;
import java.io.PrintStream;

public class CharacterDemo0 {

    public static void main(String[] args) {
        
        println(Character.SIZE);                // 16
        println((int)(Character.MAX_VALUE));    // 65535

        try (PrintStream s = new PrintStream("unicode.txt", "UTF-8")) {
            for(int i = 32; i <= 65535; i++) {
                s.print(String.format("[%-5d %5s]", i, (char)i));
                if (i % 5 == 0) {
                    s.print('\n');
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void println(Object o) {
        System.out.println(o);
    }

    private static void line() {
        System.out.println();
    }
}

