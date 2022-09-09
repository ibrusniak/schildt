
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MemoryManagementDemo {
    
    public static void main(String[] args) {
        
        System.out.println("PID: " + ProcessHandle.current().pid());
        Collection<Integer> commCollection = new ArrayList<>();
        new Thread(new Monitor(commCollection)).start();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        
        for (int i = 0; i < availableProcessors; i++) {
            new Thread(new Worker(commCollection)).start();
        }
    }
}

class Worker implements Runnable {

    private static final int elementCount = 134217728;
    private Collection<Integer> collection;
    private static final Random generator = new Random();
    // private Thread ct = Thread.currentThread();

    public Worker(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {

        for (int i = 0; i < elementCount; i++) {
            collection.add(generator.nextInt());
            try {
                Thread.currentThread().sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Monitor implements Runnable {

    private static final Runtime rt = Runtime.getRuntime();
    private Collection<Integer> collection;

    public Monitor(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        
        while (true) {

            System.out.printf("JMV memory |total: %,10d|used: %,10d|free: %,10d|max: %,10d|size: %,10d|\n",
                rt.totalMemory() / 1024, (rt.totalMemory() - rt.freeMemory()) / 1024
                    , rt.freeMemory() / 1024
                        , rt.maxMemory() / 1024, collection.size());
                try{
                    Thread.sleep(2000);
                } catch (Exception e) {}
        }
    }
}

