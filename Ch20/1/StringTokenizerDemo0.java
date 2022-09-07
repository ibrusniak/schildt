import java.util.StringTokenizer;
import java.util.Enumeration;

public class StringTokenizerDemo0 {
    
    public static void main(String[] args) {
        
        // StringTokenizer is legacy thing
        // Could use Regexp enstead of it.

        StringTokenizer tokenizer
            = new StringTokenizer(
                "My own test string; has semicolon : and colon, and comma", " ;:,");
        
        while (tokenizer.hasMoreTokens()) {
            System.out.println("'" + tokenizer.nextToken() + "'");
        }
    }
}

