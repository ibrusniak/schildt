import java.util.regex.PatternSyntaxException;

public class Matches {

    private static final String usage
        = """

        Progrma to text String.matches() method.
        Usage: java Matches InputString Regexp,
        where:
            InputString - string to verify regexp
            Regexp - regular expression to verify

        """;

    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println(usage);
            return;
        }

        System.out.printf("Input string: [%s]\n", args[0]);
        System.out.printf("Regexp: [%s]\n", args[1]);

        try {
            System.out.println("Matches: " + args[0].matches(args[1]));
        } catch (PatternSyntaxException e) {
            System.out.println("\n" + e);
        }
    }
}

