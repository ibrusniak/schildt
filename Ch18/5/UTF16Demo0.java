import java.io.PrintStream;
import java.util.Arrays;

public class UTF16Demo0 {

    private static final String USAGE = """
            UTF16Demo0 - save a text to a file (with *.out extention) using various encoding.

            Usage:
                UTF16Demo0 text file_name encodint
            
            Where:
                text        - text in quotation marks, like \"this is text\" or 'this is text'.
                file        - file name without extention.
                encoding    - one of UTF-8, UTF-16, UTF-16BE, UTF-16LE
            """;

    private static final String[] allowedEncodings
        = new String[]{ "UTF-8", "UTF-16", "UTF-16BE", "UTF-16LE" };

    public static void main(String[] args) {

        try {
            if (!Arrays.asList(allowedEncodings).contains(args[2]))
                throw new IllegalArgumentException();
            writeTextToFileUtf16(args[0], args[1], args[2]);
        } catch (Exception e) {
            System.out.println(USAGE);
            System.out.println(e.getMessage());
        }
    }

    private static void writeTextToFileUtf16(String text, String fName, String encoding) {
        
        String fullFileName = String.format("%s_%s.out",
                fName, encoding.toLowerCase().replace("-", "_"));

        try (PrintStream ps = new PrintStream(fullFileName, encoding)) {

            ps.print(text);            
        } catch (Exception e) {
            System.out.println("Coudn't write file " + fName);
            e.printStackTrace();
        }
    }
}

