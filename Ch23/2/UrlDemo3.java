
import java.net.URL;
import java.net.MalformedURLException;

import java.io.PrintStream;
import java.io.File;

public class UrlDemo3 {

    public static void main(String[] args) {

        try {

            PrintStream ps = new PrintStream(new File("file1.out"));
            ps.println("Foo bar baz");
            ps.close();

            ps = new PrintStream(new File("file2.out"));
            ps.println("Foo bar baz");
            ps.close();

            ps = new PrintStream(new File("file3.out"));
            ps.println("Foo bar");
            ps.close();

            String cwd = System.getProperty("user.dir");
            URL url1 = new URL("file://" + cwd + "/file1.out");
            URL url2 = new URL("file://" + cwd + "/file2.out");
            URL url3 = new URL("file://" + cwd + "/file3.out");

            System.out.println("url1: " + url1);
            System.out.println("url2: " + url2);
            System.out.println("url3: " + url3);

            System.out.println("url1 is the same file as url2: " + url1.sameFile(url2));
            System.out.println("url1 is the same file as url3: " + url1.sameFile(url3));
            // both - false
            // sameFile() does not compare content of files;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

