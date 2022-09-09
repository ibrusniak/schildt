public class UnicodeCharacter {
    private static final String USAGE = """

            UnicodeCharacter - prints unicode character info by its code.
            Usage: java UnicodeCharacter code,
            where:
                code -  hexadecimal code like 0x1F615 or 0X1F615
                        or simple decimal code 128533
            
            """;
    private static final String WR = Character.toString(0x1F615)
        + "\nSomething went wrong!\n";
    
    public static void main(String[] args) {
        try {
            int codePoint = Integer.decode(args[0]);
            String symbol = Character.toString(codePoint);
            System.out.printf("hex: %1$h dec: %1$d name: \'%2$s\' sym: \'",
                codePoint, Character.getName(codePoint));
            System.out.println(symbol + "\'");
        } catch (Exception e) {
            System.out.print(WR + USAGE);
            e.printStackTrace();
        }
    }    
}

