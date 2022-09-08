import java.io.StringReader;
import java.util.StringJoiner;

public class StringReaderDemo0 {
    public static void main(String[] args) throws Exception {
        String latinChars = "String with only latin chars";
        String cyrillicChar = "Строка с кириллическими символами и латинскими: latin";

        print(latinChars);
        print(cyrillicChar);
    }
    
    private static void print(String source) throws Exception {
        StringReader sr = new StringReader(source);
    
        System.out.println();
        StringJoiner joiner = new StringJoiner("");
        joiner.add(source + String.format("%n[%-10s|%-10s|%-10s|%14s|%30s]",
            "Int", "Hex", "Char", "Directionality", "Codepoint name"));
        int codePoint;
        while ((codePoint = sr.read()) != -1) {
            joiner.add(String.format("%n[%1$-10d|%1$-10h|%1$-10c|%2$14d|%3$30s]",
                codePoint,
                Character.getDirectionality(codePoint),
                Character.getName(codePoint)));
        }
        System.out.println(joiner.toString());
        System.out.println();
        sr.close();
    }
}

