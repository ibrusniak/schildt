
import java.net.URL;
import java.net.URLConnection;

import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.UUID;

public class ImageFatcher {

    public static void main(String args[]) throws Exception {

        String imagesPath = System.getProperty("user.dir") + "/images";
        File imagesFolder = new File(imagesPath);

        if (!imagesFolder.exists()) {
            imagesFolder.mkdir();
        }

        URLConnection connection = openConnection(args[0]);
        InputStream inputStream = connection.getInputStream();
        int i = 0;
        String s = "";

        while ((i = inputStream.read()) != -1) {
            s += (char) i;
        }

        inputStream.close();

        Pattern pattern = Pattern.compile("(?<=img src=\")http.*jpg");
        Matcher matcher = pattern.matcher(s);

        matcher.results()
            .forEach(r -> {
                try {
                    downloadFile(r.group(), imagesPath);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
    }

    private static URLConnection openConnection(String URL) throws Exception {
        return new URL(URL).openConnection();
    }

    private static void downloadFile(String link, String folder) throws Exception {

        URL url = new URL(link);
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        String fileName = UUID.randomUUID().toString() + ".jpg";
        String filePath = folder + "/" + fileName;
        FileOutputStream fout = new FileOutputStream(filePath);

        int i = 0;
        while ((i = in.read()) != -1)
            fout.write(i);
        
        System.out.printf("downloaded: [%s] --> [%s] (%s bytes)%n",
            url, filePath, connection.getContentLength());

        in.close();
        fout.close();
    }
}

