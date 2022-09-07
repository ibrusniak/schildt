import java.nio.file.Path;
import java.util.Scanner;

public class ScannerDemo0 {

    // Document:
    // https://datatracker.ietf.org/doc/html/rfc8259
    // The JavaScript Object Notation (JSON) Data Interchange Format
    
    private static final String URI = "RFC7159.txt";

    public static void main(String[] args) {
        
        Path path = Path.of(URI);

        System.out.println();
        try (Scanner sc = new Scanner(path, "UTF-8")) {
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

