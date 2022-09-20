import java.io.PrintStream;

public class StackTraceElementDemo0 {

    public static void main(String[] args) {

        PrintStream ps = System.out;

        try {
            System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));            
        } catch (Exception e) {

            ps.println("\nprintStackTrace():\n");
            e.printStackTrace();
            ps.println("\nStack trace elements:\n");

            for (StackTraceElement traceElement : e.getStackTrace()) {
                ps.printf("file: %s, module: %s, class: %s, method: %s, line: %s%n",
                    traceElement.getFileName(),
                    traceElement.getModuleName(),
                    traceElement.getClassName(),
                    traceElement.getMethodName(),
                    traceElement.getLineNumber());
            }
        }
        ps.println();
    }
}


