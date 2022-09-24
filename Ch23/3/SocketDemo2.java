
import java.net.Socket;

import java.io.InputStream;
import java.io.OutputStream;

public class SocketDemo2 {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("www.example.com", 80);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

        out.write("GET / HTTP/1.0\r\n".getBytes());
        out.write("Host: www.example.com\r\n".getBytes());
        out.write("\r\n".getBytes());

        int i;
        while((i = in.read()) != -1) {
            System.out.print((char)i);
        }

        socket.close();
    }
}

