import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;


public class ProcessBulder {

    private static final String FILE_NAME = "Process";
    private static final String J_FILE_NAME = FILE_NAME + ".java";
    private static final String C_FILE_NAME = FILE_NAME;
    private static final String OUTPUT_FILE = FILE_NAME + ".out";
    private static final String INPUT_FILE = FILE_NAME + ".in";

    public static void main(String[] args) {
        
        if(!new File(J_FILE_NAME).exists())
            throw new Error(J_FILE_NAME + " file does't exist!");

        ProcessBuilder pb = new ProcessBuilder("");
        
        ArrayList<String> command = new ArrayList<>();
        command.add("javac");
        command.add(J_FILE_NAME);
        pb.command(command);

        try {
            pb.start();
        } catch (Exception e) {
            System.out.println("Could't compile java file " + J_FILE_NAME + "!");
            e.printStackTrace();
            return;
        }

        try {
            // Wait while javac compiles file
            Thread.currentThread().sleep(2000);
        } catch (Exception e) {}

        if(!new File(C_FILE_NAME + ".class").exists()) {
            System.out.println("Compilation was not successful! File " + C_FILE_NAME);
            return;
        }

        command.clear();
        command.add("java");
        command.add(C_FILE_NAME);

        try (PrintStream ps = new PrintStream(INPUT_FILE)) {
            ps.println("Here is string input for process!");
        } catch (Exception e) {
            System.out.println("Couldn't write input file!");
            return;
        }

        pb.redirectOutput(new File(OUTPUT_FILE));
        pb.redirectInput(new File(INPUT_FILE));
        
        try {
            pb.start();
        } catch (Exception e) {
            System.out.println("Couldn't start process!");
            e.printStackTrace();
            return;
        }
    }
}
