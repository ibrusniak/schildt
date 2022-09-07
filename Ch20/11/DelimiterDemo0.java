
import java.io.FileReader;
import java.io.StringReader;
import java.util.Scanner;

public class DelimiterDemo0 {
    
    public static void main(String[] args) throws Exception {
        
        String source
            = "Scanner defines where a token starts and ends based on a set of delimiters.";

        System.out.println(source);
        System.out.println();

        StringReader sr = new StringReader(source);
        Scanner scanner = new Scanner(sr);

        scanner.useDelimiter(" ");

        while (scanner.hasNext()) {
            System.out.printf(scanner.next());
            System.out.println();
        }
        System.out.println();

        scanner.close();
        sr.close();
    }
}

