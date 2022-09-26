
import java.net.URL;
import java.net.URLConnection;

import java.util.Map;
import java.util.List;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class URLConnectionDemo0 {

    public static void main(String[] args) throws Exception {

        URL url = new URL(args[0]);

        URLConnection connection = url.openConnection();

        Map<String, List<String>> headerFieldsMap = connection.getHeaderFields();
        System.out.printf("%nConnection url: %s%n%n", connection.getURL());

        headerFieldsMap.forEach((k, v) -> System.out.printf("%s: %s%n", k, v));

        System.out.println("*".repeat(80));

        connection = url.openConnection();
        
        connection.setDoOutput(true);

        OutputStream outputStream = connection.getOutputStream();
        BufferedWriter bufferedWirter = new BufferedWriter(new OutputStreamWriter(outputStream));

        String s = "GET / HTTP/1.1";
        bufferedWirter.write(s, 0, s.length());
        bufferedWirter.newLine();
        s = "Host: " + url.getHost();
        bufferedWirter.newLine();
        bufferedWirter.newLine();

        InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String readed = "";
        while ((readed = bufferedReader.readLine()) != null) {
            System.out.printf("\t%s%n", readed);
        }

        System.out.println("*".repeat(80));

        connection = url.openConnection();
        bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((readed = bufferedReader.readLine()) != null) {
            System.out.printf("\t%s%n", readed);
        }

        bufferedReader.close();
        bufferedWirter.close();
    }
}

