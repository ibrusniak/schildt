import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 20; i++) {
            String message = 
                String.format("Outputmessage-%04d",i);
            System.out.println(message);
            Thread.sleep(1000);
        }

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();

        PrintStream ps = new PrintStream(String.format("output-%04d.out",
            new Random().nextInt(1001)));
        
        ps.println(input);
    }
}

