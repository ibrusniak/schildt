
import java.net.URL;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UrlDemo0 {

    public static void main(String[] args) throws Exception {

        URL url0 = new URL(args[0]);
        InputStream in = url0.openStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        br.lines().forEachOrdered(System.out::println);

        br.close();
        in.close();
    }
}

