
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uncrustify {

    private static final String BANNER = """
            Uncrustify - solves stackoverflow issue https://stackoverflow.com/questions/73685531
            Finds all strings like 'b.add(1).add(1).add(2).add(3).add(4);'
            and uncrustify them like this:
                b.add(1)
                 .add(2)
                 .add(3)
                 .add(4);
            """;

    private static final String USAGE = """
            Usage: java Uncrustify.java filename
            """;

    public static void main(String[] args) {

        PrintStream out = System.out;
        
        if (args.length == 0) {
            out.println(BANNER);
            out.println(USAGE);
            return;
        }

        String sourceFileName = args[0];
        File copy = null;

        try {
            copy = makeFileCopy(sourceFileName);
            out.println("Copy of the file '" + sourceFileName
                + "' has created with name '" + copy.getName() + "'");
        } catch (Exception e) {
            out.println("Could't create copy of the file!");
            e.printStackTrace();
            return;
        }

        try {
            incrustify(copy);
        } catch (Exception e) {
            out.println("Could't incrustify the file!");
            e.printStackTrace();
        }
    }

    private static void incrustify(File file) throws Exception {

        String fileName = file.getName();

        if (!file.exists())
            throw new FileNotFoundException(file.getName());
            
        if (file.length() == 0) {
            throw new Exception("File is empty!");
        }

        String newText = "";
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            
            String nextLine = "";
            String patternFullString = ".*((\\._*[a-zA-Z0-9]+\\([^\\(\\)]*\\)){3,}).*";
            String patternExcactlyString = "((\\._*[a-zA-Z0-9]+\\([^\\(\\)]*\\)))+";

            while ((nextLine = in.readLine()) != null) {

                if (nextLine.matches(patternFullString)) {
                    
                    String excactly = nextLine;
                    String[] strs = nextLine.split(patternExcactlyString);
                    for (int i = 0; i < strs.length; i++) {
                        excactly = excactly.replace(strs[i], "");
                    }
                    int spaceCount = nextLine.indexOf(excactly);
                    String[] functions = excactly.substring(1).split("\\.");
                    nextLine = strs[0];
                    for (int i = 0; i < functions.length; i++) {
                        nextLine += (i == 0) ? "." + functions[i]
                            : "\n" + " ".repeat(spaceCount) + "." + functions[i];
                    }
                    if (strs.length >= 2)
                        nextLine += strs[strs.length - 1];
                }
                newText += nextLine + "\n";
            }
        } catch (Exception e) {
            throw e;
        }

        System.out.println("\n\n\n" + newText + "\n\n\n");
    }

    private static File makeFileCopy(String sourceFileName)
        throws Exception {

        File sourceFile = new File(sourceFileName);

        if(!sourceFile.exists())
            throw new FileNotFoundException("File '" + sourceFileName + "' not found!");

        if(!sourceFile.canRead())
            throw new Exception("Can't read file '" + sourceFileName + "'. Not enought access rights!");

        String postfix = String.format("_copy_%07d",
            new Random().nextInt(1000001));
        
        int lastIndexOfDot = sourceFileName.lastIndexOf('.');

        String workingFileName = lastIndexOfDot == -1
            ? sourceFileName + postfix
            : sourceFileName.substring(0, lastIndexOfDot)
                + postfix + sourceFileName.substring(lastIndexOfDot, sourceFileName.length());
        
        File workingFile = new File(workingFileName);
        
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            
            fin = new FileInputStream(sourceFile);
            fout = new FileOutputStream(workingFile);

            byte[] buffer = new byte[1];
            while (fin.read(buffer) != -1) {
                fout.write(buffer);
            }
        } catch (Exception e) {
            throw e;
        }

        try {
            fin.close();
            fout.close();
        } catch (Exception e) {
            throw e;
        }

        return workingFile;
    }
}

