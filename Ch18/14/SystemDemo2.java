import java.io.PrintStream;
import java.lang.System.Logger.Level;

public class SystemDemo2 {
    
    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream("out-err.log"));
        System.setErr(new PrintStream("out-err.log"));

        System.Logger logger = System.getLogger("logger0");

        logger.log(Level.ERROR, "Error2");
        logger.log(Level.ERROR, "Throwable", new Exception("New Exception instance created!"));
        logger.log(Level.TRACE, SystemDemo2.class);
        logger.log(Level.INFO, "info message");
        logger.log(Level.ERROR, "Error2");
    }
}

