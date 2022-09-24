
import java.net.Socket;
import java.net.UnknownHostException;

import java.io.InputStream;
import java.io.OutputStream;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class SocketTester3 {

    private static String host;
    private static int port = 0;
    private static final String exitCommand = "exit";
    private static final String sendCommand = "write";
    private static final String msgDelimiter = "*".repeat(80);
    private static final long sleepTime = 10;

    public static void main(String[] args) throws Exception {

        if (args.length < 2) {
            println("Insufficient arguments count!");
            println("Usage: SocketTester3 host port");
            return;
        }

        try {
            host = args[0];
            port = Integer.parseInt(args[1]);
        } catch (Exception e) {
            println("Wrong arguments!");
            println(e);
            println("Usage: SocketTester3 host port");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        String s = "";

        try(Socket socket = new Socket(host, port)) {
        } catch (Exception e) {
            println(e);
            return;
        }

        ArrayList<String> linesToSend = new ArrayList<>();

        println("Enter line after line. Then enter 'write'.");
        println("Enter 'exit' to exit program.");
        println(msgDelimiter);

        while (!(s = scanner.nextLine()).equals(exitCommand)) {

            try (
                Socket socket = new Socket(host, port);
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
            ) {
                linesToSend.clear();
                linesToSend.add(s);
                String nextLine = "";
                while (!(nextLine = scanner.nextLine()).equals(sendCommand)) {
                    if (nextLine.equals(exitCommand)) {
                        socket.close();
                        return;
                    }
                    linesToSend.add(nextLine);
                }
                Iterator<String> iterator = linesToSend.iterator();
                println(msgDelimiter);
                while (iterator.hasNext()) {
                    String line = iterator.next();
                    println("writing to socket: '" + line + "'");
                    outputStream.write((line + "\r\n").getBytes());
                }
                println(msgDelimiter);
                println("reading from socket...");
                println();

                int i = 0;
                while((i = inputStream.read()) != -1) {
                    try {
                        Thread.currentThread().sleep(sleepTime);
                    } catch (Exception e) {};
                    print((char)i);
                }
                println(msgDelimiter);
            } catch (Exception e) {
                println("Exception!");
                println(e);
            }
        }
    }

    private static void println() {
        System.out.println();
    }

    private static void println(Object msg) {
        System.out.println(msg);
    }

    private static void print(Object msg) {
        System.out.print(msg);
    }
}

