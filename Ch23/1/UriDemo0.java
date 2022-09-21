
import java.net.URI;
import java.net.URISyntaxException;

public class UriDemo0 {

    public static void main(String[] args) throws Exception {
        
        String str1 = "https://www.example.com/index.html";
        URI uri1 = new URI(str1);

        System.out.println(uri1);

        try {
            URI uri2 = new URI("bla.bla.%bla");
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        URI uri3 = URI.create("localhost");
        URI uri4 = URI.create("192.168.0.1");

        System.out.println(uri3);
        System.out.println(uri4);
        System.out.println(uri3.normalize());
        System.out.println(uri4.normalize());
    }
}

