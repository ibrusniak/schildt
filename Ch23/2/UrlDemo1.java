
import java.net.URL;
import java.net.MalformedURLException;

import java.io.IOException;
import java.io.BufferedInputStream;

import java.nio.charset.Charset;

import java.util.StringTokenizer;

public class UrlDemo1 {

    public static void main(String[] args) {

        URL url = null;

        try {
            url = new URL("https", "www.example.com", 443, "/index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(url);
        System.out.println();

        try(BufferedInputStream in = new BufferedInputStream(url.openStream())) {

            byte[] allBytes = in.readAllBytes();
            String s = new String(allBytes, Charset.forName("UTF-8"));
            StringTokenizer tokenizer = new StringTokenizer(s, "\n");

            while (tokenizer.hasMoreTokens()) {
                System.out.println(tokenizer.nextToken());
                try {
                    Thread.currentThread().sleep(150);
                } catch (Exception e) {}
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}

