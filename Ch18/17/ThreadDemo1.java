import java.io.PrintStream;

public class ThreadDemo1 {

    public static void main(String[] args) {
        
        PrintStream ps = System.out;

        ps.printf("""
                Thread priority constants:
                min priority:  %5d
                norm priority: %5d
                max priority:  %5d
                """, Thread.MIN_PRIORITY,
                    Thread.NORM_PRIORITY,
                    Thread.MAX_PRIORITY);

        ps.println();
        ps.println(Thread.currentThread());
        ps.println(Thread.activeCount());
        
        ps.println("Debug #1");
        new Thread(() -> { try {Thread.sleep(2000);} catch (Exception e) {}}).start();
        ps.println("Debug #2");

        ps.println(Thread.activeCount());
    }
}

