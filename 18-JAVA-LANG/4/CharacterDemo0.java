
import java.io.FileInputStream;
import java.io.PrintStream;

public class CharacterDemo0 {
    
    private static final String content
        = "Папа Hello";

    public static void main(String[] args) {

        saveTextToFile(content, "Ex_UTF_8.txt", "UTF-8");
        saveTextToFile(content, "Ex_UTF_16.txt", "UTF-16");

        printBinaryRepresentationOfFile("Ex_UTF_8.txt");
        printBinaryRepresentationOfFile("Ex_UTF_16.txt");
    }

    private static void saveTextToFile(String content, String fileName, String encoding) {
        try (PrintStream ps = new PrintStream(fileName, encoding)) {
            ps.println(content);
        } catch (Exception e) {
            System.out.println("Couldn't write file " + fileName);
            e.printStackTrace();
        }
    }

    private static void printBinaryRepresentationOfFile(String fileName) {
        
        System.out.println("\nReading and decoding file " + fileName + "\n");
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte bytes[] = new byte[1];
            int counter = 0;
            while (fis.read(bytes) != -1) {
                Integer i = Byte.toUnsignedInt(bytes[0]);
                String binaryString = Integer.toBinaryString(i);
                binaryString = ("00000000" + binaryString);
                binaryString = binaryString.substring(binaryString.length() - 8); // Padding with '0'
                System.out.printf("[%1$8s %2$3d %2$3H (%3$1s)]",
                    binaryString, i, (char)bytes[0]);
                if (++counter % 5 == 0) {
                    System.out.println();
                    counter = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("Couldn't read file " + fileName);
            e.printStackTrace();
        } finally {
            System.out.println("\n");
        }
    }
}


