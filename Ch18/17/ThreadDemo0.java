
public class ThreadDemo {
    
    public static void main(String[] args) {

        Thread t0 = new UserThread("User thread #0");
        System.out.println(Thread.currentThread() + " started");
        t0.start();
        System.out.println(Thread.currentThread() + " ended");
    }
}

class UserThread extends Thread {
    
    public UserThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " started");
        try {
            sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() + " ended");
    }
}

