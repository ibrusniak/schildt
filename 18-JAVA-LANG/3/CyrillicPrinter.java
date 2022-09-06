import java.io.PrintStream;

public class CyrillicPrinter {

    private static final int START = 0x400; // 1024 
    private static final int END = 0x4FF;   // 1279
    private static final String FNAME = "CyrillicPrinterOutput.txt";

    public static void main(String[] args) {
        
        try (PrintStream ps = new PrintStream(FNAME)) {
            
            String s1 = "", s2 = "";
            int counter = 0;
            for (int i = START; i <= END; i++) {
                s1 += String.format("%6s", (char)i);
                s2 += String.format("%6H", i);
                if (counter++ == 16) {
                    s1 += '\n';
                    s2 += "\n\n";
                    counter = 0;
                    System.out.print(s1);
                    System.out.print(s2);
                    ps.print(s1);
                    ps.print(s2);
                    s1 = "";
                    s2 = "";
                }
            }
            s1 += '\n';
            s2 += "\n\n";
            System.out.print(s1);
            System.out.print(s2);
            ps.print(s1);
            ps.print(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


