import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

public class UriDemo1 {

    public static void main(String[] args) {
        
        String fileName = "";

        try {
            fileName = args[0];
        } catch (Exception e) {
            System.out.println("Please provide valis file name as first parameter!");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, Charset.forName("UTF-8")))) {
            
            reader.lines()
                .filter(line -> line.matches(".+"))
                .forEachOrdered(line -> {
                    try {

                        System.out.printf("%nCurrent line: %s%n", line);
                        URI uri = new URI(line);
                        System.out.printf("+++ '%s' is valid URI!%n", line);
                        String urlS = "";
                        try {
                            URL url = uri.toURL();
                            urlS = url.toString();
                        } catch (Exception e) {
                            urlS = e.getMessage();
                        }
                        System.out.printf("""
                                    to URL:     %s
                                    scheme:     %s
                                    authority:  %s
                                    user info:  %s
                                    host:       %s
                                    port:       %s
                                    query:      %s
                                    fragment:   %s
                                    normalized: %s
                                """,
                                urlS,
                                uri.getScheme(),
                                uri.getAuthority(),
                                uri.getUserInfo(),
                                uri.getHost(),
                                uri.getPort(),
                                uri.getQuery(),
                                uri.getFragment(),
                                uri.normalize());
                    } catch (URISyntaxException e) {
                        System.out.printf("--- '%s' is not valid URI!%n%s%n", line, e.getMessage());
                    }
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


