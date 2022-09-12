
import java.util.Random;

import java.io.File;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Uncrustify {

    private static final String PATTERN_FULL_STRING = ".*((\\._*[a-zA-Z0-9]+\\([^\\(\\)]*\\)){3,}).*";
    private static final String PATTERN_EXCACTLY_STRING = "((\\._*[a-zA-Z0-9]+\\([^\\(\\)]*\\)))+";
    private static final String ASCIIART = """

            ██╗░░░██╗███╗░░██╗░█████╗░██████╗░██╗░░░██╗░██████╗████████╗██╗███████╗██╗░░░██╗
            ██║░░░██║████╗░██║██╔══██╗██╔══██╗██║░░░██║██╔════╝╚══██╔══╝██║██╔════╝╚██╗░██╔╝
            ██║░░░██║██╔██╗██║██║░░╚═╝██████╔╝██║░░░██║╚█████╗░░░░██║░░░██║█████╗░░░╚████╔╝░
            ██║░░░██║██║╚████║██║░░██╗██╔══██╗██║░░░██║░╚═══██╗░░░██║░░░██║██╔══╝░░░░╚██╔╝░░
            ╚██████╔╝██║░╚███║╚█████╔╝██║░░██║╚██████╔╝██████╔╝░░░██║░░░██║██║░░░░░░░░██║░░░
            ░╚═════╝░╚═╝░░╚══╝░╚════╝░╚═╝░░╚═╝░╚═════╝░╚═════╝░░░░╚═╝░░░╚═╝╚═╝░░░░░░░░╚═╝░░░
            """;
    private static final String BANNER = """

            Uncrustify - solves stackoverflow issue https://stackoverflow.com/questions/73685531
            
            Finds all strings like 'b.add(1).add(1).add(2).add(3).add(4);'
            and uncrustify them like this:
                b.add(1)
                 .add(2)
                 .add(3)
                 .add(4);
            
            NOTE! Uncrustify doesn't modify existing file! It creates new file int the same
            directory instead.
            
            """;
    private static final String USAGE = """
            Usage: java Uncrustify.java filename
            """;

    public static void main(String[] args) {

        PrintStream out = System.out;

        if (args.length == 0) {
            out.println(USAGE);
            return;
        }

        String sourceFileName = args[0];
        File sourceFile = new File(sourceFileName);

        if (!sourceFile.exists()) {
            out.println("File '" + sourceFileName + "' does't exist!");
            out.println(USAGE);
            return;
        }

        if (!sourceFile.canRead()) {
            out.println("Catn't read read file '" + sourceFileName + "' because of access rights!");
            return;
        }

        if (sourceFile.length() == 0) {
            out.println("File '" + sourceFileName + "' is empty!");
            return;
        }

        if (!checIfFileCanBeUncrustified(sourceFile)) {
            out.println("There is nothing to uncrustify in the file '" + sourceFileName + "'!");
            return;
        }

        String targetFileName = getTargetFileName(sourceFileName);
        File targetFile = new File(targetFileName);

        try {
            uncrustify(sourceFile, targetFile);
        } catch (Exception e) {
            out.println("Couldn't uncrustify file '" + sourceFileName + "'!");
            e.printStackTrace();
            return;
        }

        showAsciiArt();
        out.println(BANNER);
        out.println("All done!" + Character.toString(0x1F9D0));
    }

    private static void uncrustify(File source, File target) throws Exception {

        BufferedReader in = null;
        PrintStream ps = null;

        in = new BufferedReader(new InputStreamReader(new FileInputStream(source)));
        ps = new PrintStream(target);
        String nextLine = "";

        while ((nextLine = in.readLine()) != null) {

            if (nextLine.matches(PATTERN_FULL_STRING)) {
                
                String excactly = nextLine;
                String[] strs = nextLine.split(PATTERN_EXCACTLY_STRING);
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
            ps.println(nextLine);
        }

        in.close();
        ps.close();
    }

    private static String getTargetFileName(String sourceFileName) {
        
        String postfix = String.format("_incrustified_%04d",
            new Random().nextInt(1001));
    
        int lastIndexOfDot = sourceFileName.lastIndexOf('.');

        String targetFileName = lastIndexOfDot == -1
            ? sourceFileName + postfix
            : sourceFileName.substring(0, lastIndexOfDot)
                + postfix + sourceFileName.substring(lastIndexOfDot, sourceFileName.length());

        if (new File(targetFileName).exists())
            return getTargetFileName(sourceFileName);
        
        return targetFileName;
    }

    private static void showAsciiArt() {

        String[] parts = ASCIIART.split("\\n");

        for (int i = 0; i < parts.length; i++) {
            
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            System.out.println(parts[i]);
        }

        try {
            Thread.sleep(300);
        } catch (Exception e) {}
    }

    private static boolean checIfFileCanBeUncrustified(File source) {

        boolean result = false;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(source)))) {
            
            String nextLine = "";
            while ((nextLine = in.readLine()) != null) {
                if (nextLine.matches(PATTERN_FULL_STRING)) 
                    result = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

