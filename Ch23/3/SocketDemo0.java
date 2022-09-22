
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

import java.nio.charset.Charset;

public class SocketDemo0 {

    public static void main(String[] args)
        throws UnknownHostException, IOException {

        Socket s = new Socket("www.example.com", 80);
        s.setSoTimeout(5000);

        OutputStream out = s.getOutputStream();
        PrintWriter writer = new PrintWriter(out, true);

        writer.println("GET /index.html HTTP/1.1");
        writer.println("Host: example.com");
        writer.println("User-Agent: Simple Http Client");
        writer.println("Accept: text/html");
        writer.println("Accept-Language: en-US");
        writer.println("Connection: close");
        writer.println();

        System.out.println("Debug #0");

        InputStream in = s.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        s.close();
    }
}

