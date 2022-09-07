import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo1 {

    public static void main(String[] args) {
        
        TimerTask task = new MyTask();
        Timer sceduler = new Timer();

        sceduler.scheduleAtFixedRate(task, new Date(), 1000);

        try {
            Thread.sleep(8000);
        } catch (Exception e) {}

        sceduler.cancel();
    }
}

class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("task working");
    }
}

