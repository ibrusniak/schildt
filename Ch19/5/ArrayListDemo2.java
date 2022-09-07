
import java.lang.Thread;
import java.util.ArrayList;

public class ArrayListDemo2 extends Thread {
    
    public static void main(String[] args) {
        
        ArrayList<Long> list = new ArrayList<>(1);

        delay(5);
        list.ensureCapacity(1000000000);
        delay(5);
        list.trimToSize();
        delay(5);
    }

    private static void delay(int seconds) {
        try {
            sleep(1000 * seconds);
        } catch (Exception e) {}
    }
}

