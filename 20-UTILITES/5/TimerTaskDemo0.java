import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo0 {

    public static void main(String[] args) {

        System.out.println("main thread start");
        
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 5000);
        timer.schedule(new MyTask(), 7000);
        
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        timer.cancel();

        System.out.println("main thread end");
    }
}

class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(this + " running. "
            + Thread.currentThread().getName());        
    }
}

