
import java.net.URL;
import java.net.URLConnection;

import java.util.Date;

public class UrlDemo1 {

    public static void main(String[] args) throws Exception {

        URL url = new URL(args[0]);

        System.out.printf("""

            URL details:
             protocol: %s
             authority: %s
             user info: %s
             host: %s
             port: %s
             ref: %s
             file: %s
             path: %s
            """,
            url.getProtocol(),
            url.getAuthority(),
            url.getUserInfo(),
            url.getHost(),
            url.getPort(),
            url.getRef(),
            url.getFile(),
            url.getPath());
        
        URLConnection urlConnection = url.openConnection();
        System.out.printf("\n%s [%s]\n\n", urlConnection.getClass(),
            urlConnection.getURL());
        
        System.out.printf("""
            Resource details:
             date: %s,
             last modified: %s,
             content type: %s,
             content length: %s bytes
            """,
            new Date(urlConnection.getDate()),
            new Date(urlConnection.getLastModified()),
            urlConnection.getContentType(),
            urlConnection.getContentLength());
    }
}

