import java.io.PrintStream;

public class CharacterDemo0 {

    public static void main(String[] args) {

        PrintStream ps = System.out;
     
        char[] hexDigits = "0123456789abcdef".toCharArray();

        for (int i = 0; i < hexDigits.length; i++) {
            ps.println(
                String.format("hex %s = dec %d",
                    hexDigits[i], Character.digit(hexDigits[i], 16)));
        }
    }
}

