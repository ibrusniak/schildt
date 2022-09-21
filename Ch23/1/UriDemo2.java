import java.net.URI;

public class UriDemo2 {

    public static void main(String[] args) throws Exception {

        URI uri1 = URI.create("http://www.example.com/courses/java/begginers/1");
        URI uri2 = URI.create("../../cpp/middle/3");

        System.out.println(uri1);
        System.out.println(uri2);
        
        System.out.println(uri1.resolve(uri2));
        
        URI uri3 = URI.create("../testlab/1");
        
        System.out.println(uri1.resolve(uri3));
    }
}

