import java.io.PrintStream;

public class PrintAllUnicode {
    
    private static final String INFO = """
            
            PrintAllUnicode - prints all unicode characters to file or stdout.
            Usage:
                PrintAllUnicode         - print all unicode to stdout.
                PrintAllUnicode fname   - print all Unicode characters to the file.

            """;

    public static void main(String[] args) {

        try {
            PrintStream target = null;
            target = args.length > 0
                ? new PrintStream(args[0], "UTF-8")
                    : System.out;
            printAllUnicode(target);
            target.close();
        } catch (Exception e) {
            System.out.println(INFO);
            e.printStackTrace();
        }
    }

    private static void printAllUnicode(PrintStream targer) throws Exception {

        targer.printf("[%7s|%6s|%-88s|%546s|]\n",
            "dec", "hex", "name", "type", "chr");

        for (int i = 0; i <= Character.MAX_CODE_POINT; i++) {

            String format =
                i < 32
                    ? "[%1$7d|%1$6h|%3$-88s|%4$46s| empty]"
                    : "[%1$7d|%1$6h|%3$-88s|%4$46s| %2$3s]";

            targer.printf(format, i,
                Character.toString(i), Character.getName(i),
                Character.UnicodeBlock.of(i));
            targer.println();
        }
        targer.println();
    }
}

