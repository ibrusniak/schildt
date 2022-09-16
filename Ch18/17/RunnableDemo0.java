
public class RunnableDemo0 implements Runnable {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            new Thread(new RunnableDemo0()).start();            
        }
    }

    @Override
    public void run() {

        System.out.printf("%s started%n", Thread.currentThread());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("%s ended%n", Thread.currentThread());
    }
}

