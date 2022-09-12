import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ProcessBuilderDemo0 {
    
    private static final String DIR = "trash";
    private static final String FNAME_PREFIX = "virus";
    private static final int COUNT = 10000;

    public static void main(String[] args) throws Exception {
        
        File subDir = new File(DIR);

        if (!subDir.exists()) subDir.mkdirs();

        ProcessBuilder pb = new ProcessBuilder("");
        ArrayList<String> command = new ArrayList<>();

        pb.directory(subDir);
        command.add("touch"); // GNU/Linux OS only!
        command.add("");
        for (int i = 0; i < COUNT; i++) {
            command.set(1, FNAME_PREFIX + i + ".out");
            pb.command(command).start();
        }
    }
}


