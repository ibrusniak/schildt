
import java.util.Scanner;

public class ScannerDemo0 {

    public static void main(String[] args) {

        String source = """
                Scanner is the complement of Formatter. It reads formatted input and
                converts it into its binary form. Scanner can be used to read input from the
                console, a file, a string, or any source that implements the Readable interface
                or ReadableByteChannel. For example, you can use Scanner to read a number
                from the keyboard and assign its value to a variable. As you will see, given its
                power, Scanner is surprisingly easy to use.                
                """;

        System.out.println();

        try (Scanner sc = new Scanner(source)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

