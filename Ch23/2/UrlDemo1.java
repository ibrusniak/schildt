
import java.net.URL;
import java.net.MalformedURLException;

import java.io.IOException;
import java.io.BufferedInputStream;

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

        try(BufferedInputStream in = new BufferedInputStream(url.openStream())) {

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    private static void debug(Object message) {
        System.out.println("DEB: " + message);
    }
}

