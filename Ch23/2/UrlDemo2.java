
import java.net.URL;
import java.net.MalformedURLException;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;

public class UrlDemo2 {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://www.example.com/index.html");
            Object content = url.getContent();

            System.out.println(content.getClass());
            // output:
            // class sun.net.www.protocol.http.HttpURLConnection$HttpInputStream
            BufferedInputStream bs = new BufferedInputStream((InputStream)content);
            String s = new String(bs.readAllBytes());
            System.out.println(s);
            // output:
            // html code of the 'www.example.com' page
            bs.close();
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL!");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

