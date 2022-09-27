
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

import java.util.Date;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class HttpURLConnectionDemo1 {

    public static void main(String[] args) throws Exception {

        URLConnection conn1 = new URL("ftp://someserver.org").openConnection();
        URLConnection conn2 = new URL("http://example.com").openConnection();
        URLConnection conn3 = new URL("https://example.com").openConnection();

        println(conn1);
        // sun.net.www.protocol.ftp.FtpURLConnection:ftp://someserver.org
        println(conn2);
        // sun.net.www.protocol.http.HttpURLConnection:http://someserver.org
        println(conn3);
        // sun.net.www.protocol.https.DelegateHttpsURLConnection:https://someserver.org

        HttpURLConnection conn4 = (HttpURLConnection)conn2;
        println(conn4);

        println();

        System.out.printf("""
            Examine abstract 'sun.net.www.protocol.http.HttpURLConnection'. Extends
            'java.net.HttpURLConnection'

             variable:          %s
             class:             %s
             request method:    %s
             content length:    %s
             content type:      %s
             last modified:     %s
             expiration:        %s
             date:              %s
             response code:     %s
             response message:  %s
            """,
            conn4,
            conn4.getClass(),
            conn4.getRequestMethod(),
            conn4.getContentLength(),
            conn4.getContentType(),
            new Date(conn4.getLastModified()),
            new Date(conn4.getExpiration()),
            new Date(conn4.getDate()),
            conn4.getResponseCode(),
            conn4.getResponseMessage());

            BufferedReader reader
                = new BufferedReader(new InputStreamReader(conn4.getInputStream()));
            
            println("\nContent:\n");

            reader.lines()
                .forEach(HttpURLConnectionDemo1::println);

            reader.close();
    }

    private static void println(Object x) {
        System.out.println(x);
    }

    private static void println() {
        System.out.println();
    }
}

