
import java.net.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.sun.nio.sctp.SctpSocketOption;

import java.util.Scanner;

public class SocketTester2 {

    private static Socket socket = null;
    private static BufferedReader is = null;
    private static PrintStream os = null;
    private static Scanner scanner = null;
    private static String host = null;
    private static int port = 0;

    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Usage: java SocketTester2 host port");
            return;
        }

        try {
            host = args[0];
            port = Integer.parseInt(args[1]);
        } catch (Exception e) {
            printErrorMessage("Invalid arguments!", e);
            return;
        }

        try {
            socket = new Socket(host, port);
            socket.setKeepAlive(true);
            System.out.printf("%s:%s opened%n", host, port);
            System.out.println("Enter string and press <Enter> to post it to the socket.");
            System.out.println("Enter '/exit' for exit program.");
        } catch (Exception e) {
            printErrorMessage("Coudn't open socket.", e);
            return;
        }

        try {
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e) {
            printErrorMessage("Coudn't open input stream.", e);
            closeAll();
            return;
        }

        try {
            os = new PrintStream(socket.getOutputStream());
        } catch (Exception e) {
            printErrorMessage("Coudn't open output stream.", e);
            closeAll();
            return;
        }

        try {
            scanner = new Scanner(System.in);
        } catch (Exception e) {
            printErrorMessage("Coudn't open scanner.", e);
            closeAll();
            return;
        }

        String input = "";
        while (!(input = scanner.nextLine()).equals("/exit")) {

            try {

                os.println(input);
                os.println("Keep-Alive: true");
                os.println();
                String line = is.readLine();
                while (line != null) {
                    delay();
                    System.out.println(line);
                    line = is.readLine();
                }
                System.out.println();
            } catch (Exception e) {}
        }

        closeAll();
        System.out.printf("%s:%s closed%n", host, port);
    }

    private static void closeAll() {

        try {
            os.close();
        } catch (Exception e) {}

        try {
            scanner.close();
        } catch (Exception e) {}

        try {
            is.close();
        } catch (Exception e) {}

        try {
            socket.close();
        } catch (Exception e) {}
    }

    private static void printErrorMessage(String msg, Exception e) {

        System.out.println(msg);
        System.out.println(e);
    }

    private static void delay() {

        try{
            Thread.currentThread().sleep(10);
        } catch (Exception e) {}
    }
}

