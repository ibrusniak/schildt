
import java.util.Iterator;
import java.util.Scanner;

public class ScannerDemo0 {

    public static void main(String[] args) {

        String source
            = "Source string for scanner. You can use Iterator to get elements of scanner.";

        System.out.println();
        try (Scanner sc = new Scanner(source)) {
            while(sc.hasNext()) {
                String s = sc.next();
                Thread.sleep(500);
                System.out.print(s + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

