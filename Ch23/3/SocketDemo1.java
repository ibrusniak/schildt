
import java.net.Socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;

public class SocketDemo1 {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.0.104", 80);

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        out.write("GET / HTTP/1.1\r\n".getBytes());
        out.write("Host: vm1\r\n".getBytes());
        out.write("Accept: text/html\r\n".getBytes());
        out.write("\r\n".getBytes());

        System.out.println(in);
        System.out.println();

        while (true) {

            int i = in.read();
            if (i == -1) {
                System.out.println("\n end of stream reached!");
                break;
            }
            System.out.print((char)i);
            try {
                Thread.currentThread().sleep(10);
            } catch (Exception e) {}
        }

        System.out.println();

        in.close();
        out.close();
        socket.close();
    }
}

