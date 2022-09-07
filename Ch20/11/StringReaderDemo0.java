
import java.io.StringReader;
import java.util.Arrays;

public class StringReaderDemo0 {

    private final static String SOURCE
        = "A character stream whose source is a string."
            + " java.io.StringReader implements Readable";

    private final static int DELAY = 100;

    public static void main(String[] args) {

        System.out.println();
        try (StringReader sr = new StringReader(SOURCE)) {
            char[] buffer = new char[50];
            sr.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                System.out.print(buffer[i]);
                Thread.sleep(DELAY);
            }
            System.out.println();
            Arrays.fill(buffer, '_');
            sr.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                System.out.print(buffer[i]);
                Thread.sleep(DELAY);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

