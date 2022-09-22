
import java.net.URL;
import java.net.MalformedURLException;

import java.io.InputStream;
import java.io.IOException;

public class UrlDemo1 {

    public static void main(String[] args) {

        URL url = null;

        try {
            url = new URL("https", "www.example.com", 443, "/index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        debug(url);

        try(InputStream in = url.openStream()) {

            debug(in.available());
            in.transferTo(System.out); // This is great!!!
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    private static void debug(Object message) {
        System.out.println("DEB: " + message);
    }
}

