import java.io.PrintStream;

public class RuntimeDemo0 {

    public static void main(String[] args) throws Exception {
        
        PrintStream ps = System.out;
        Runtime runtime = Runtime.getRuntime();

        runtime.addShutdownHook(new Thread(new ShutDownHook0()));
        runtime.addShutdownHook(new Thread(new ShutDownHook1()));
        
        ps.printf("PID %d\n", ProcessHandle.current().pid());
        ps.println();
        ps.printf("Total memory %,20d bytes\n", runtime.totalMemory());
        ps.printf("Total memory %,20d bytes\n", runtime.freeMemory());
        ps.printf("Total memory %,20d bytes\n", runtime.maxMemory());
        ps.println();
        ps.printf("Avail. processors  %d\n", runtime.availableProcessors());
        ps.println();
        ps.printf("JVM version  %s\n", Runtime.version().toString());

        Thread.sleep(60000);
    }
}

class ShutDownHook0 implements Runnable {

    @Override
    public void run() {
        System.out.println("Shutdown #0 hook works...");
    }
}

class ShutDownHook1 implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Shutdown #1 hook works...");
    }
}

