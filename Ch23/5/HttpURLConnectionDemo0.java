
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

public class HttpURLConnectionDemo0 {

    public static void main(String[] args) throws Exception {

        String uri1 = "http://www.example.com";
        String uri2 = "ftp://ftp:test@vm1/file.txt";

        URL url1 = new URL(uri1);
        URL url2 = new URL(uri2);

        System.out.println(url1.getClass());
        System.out.println(url2.getClass());

        System.out.println(url1.getProtocol()); // http
        System.out.println(url2.getProtocol()); // ftp

        URLConnection connection1 = url1.openConnection();
        URLConnection connection2 = url2.openConnection();

        System.out.println(connection1.getClass());
        // output: class sun.net.www.protocol.http.HttpURLConnection

        System.out.println(connection2.getClass());
        // output: class sun.net.www.protocol.ftp.FtpURLConnection

        HttpURLConnection httpUrlConnection = (HttpURLConnection)(url1.openConnection());
        System.out.println(httpUrlConnection.getClass());
        // output: class sun.net.www.protocol.http.HttpURLConnection
    }
}

