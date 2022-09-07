
import java.io.File;
import java.util.Scanner;

public class ScannerDemo0 {

    private static final String FILE_NAME = "ScannerDemo0Input.txt";
    private static final int DELAY = 50;
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new File(FILE_NAME), "UTF-8")) {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                char[] ch = nextLine.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    System.out.print(ch[i]);
                    Thread.sleep(DELAY);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

