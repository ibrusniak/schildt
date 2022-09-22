
import java.net.URL;
import java.net.URI;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UrlDemo0 {

    public static void main(String[] args) {

        URL url;

        String cwd = System.getProperty("user.dir");
        String fileUrl
            = "file://" + cwd + "/UrlDemo0.java";

        try {
            url = new URL(fileUrl);
        } catch (MalformedURLException e) {
            printExceptionMessage(e);
            return;
        }

        URI uri;

        try {
            uri = url.toURI();
        } catch (URISyntaxException e) {
            printExceptionMessage(e);
            return;
        }

        File file0 = new File(uri);

        try (BufferedReader reader = new BufferedReader(new FileReader(file0))) {

            System.out.println("opened " + file0.toURI());
            String currentString = "";
            while ((currentString = reader.readLine()) != null) {
                delay();
                System.out.println(currentString);
            }
        } catch (FileNotFoundException e) {
            printExceptionMessage(e);
            return;
        } catch (IOException e) {
            printExceptionMessage(e);
            return;
        }
    }

    private static void printExceptionMessage(Exception e) {
        System.out.println(e.getClass() + " / " + e.getMessage());
    }

    private static void delay() {

        try {
            Thread.currentThread().sleep(100);
        } catch (Exception e) {}
    }
}

