import java.util.ArrayList;

public class ProcessDemo0 {

    public static void main(String[] args) throws Exception {
        
        ProcessBuilder pb = new ProcessBuilder();
        ArrayList<String> cmdLine = new ArrayList<>();
        cmdLine.add("watch"); // GNU/linux OS only
        cmdLine.add("-n");
        cmdLine.add("1");
        cmdLine.add("ls");
        pb.command(cmdLine);
        
        Process p = pb.start();
        Thread.sleep(10000);
        p.destroy();
    }
}

