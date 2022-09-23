
import java.net.Socket;

import java.io.InputStream;
import java.io.OutputStream;

public class SocketTester {

    private static final String USAGE =
        """
        SocketTester - utility to test local or remote socket.
        Usage: java SocketTester host port message
        Where:  host is IP or domain name of the target host,
                port - is integer number,
                message - message with quotes
        Example:
                java SocketTester www.my-testing-host.org 8000 'hello'
        """;

    public static void main(String[] args) {

        if (args.length == 1 && args[0].equals("--help")) {
            printUsage();
            return;
        }

        String host = "";
        int port = 0;
        String message = "";

        try {

            host = args[0];
            port = Integer.parseInt(args[1]);
            message = args[2] + "\r\n";
        } catch (Exception e) {
            printUsage();
            System.out.println(e);
            return;
        }

        Socket socket = null;
        OutputStream out = null;
        InputStream in = null;

        try {

            socket = new Socket(host, port);
            in = socket.getInputStream();
            out = socket.getOutputStream();
            System.out.println("Socket opened. I/O streams are opened.");
        } catch (Exception e) {
            printUsage();
            System.out.println(e);
            try {
                socket.close();
            } catch (Exception ex) {}
            return;
        }

        byte[] bytes = message.getBytes();

        try {
            out.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                socket.close();
            } catch (Exception ex) {}
            return;
        }

        System.out.println();
        System.out.println("Response:");
        System.out.println();

        int i = 0;
        try {

            while ((i = in.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (Exception e) {

            System.out.println("Coudn't read socket...");
            System.out.println(e);
            try {
                socket.close();
                System.out.println("Socket closed.");
            } catch (Exception ex) {}
        }
        System.out.println();
        System.out.println();

        try {
            socket.close();
            System.out.println("Socket closed.");
        } catch (Exception ex) {}
    }

    private static void printUsage() {
        System.out.print(USAGE);
    }
}

