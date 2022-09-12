
import java.util.Random;

public class NexBooleanDemo0 {

    public static void main(String[] args) {
        
        int counter = 10;

        do {
            System.out.printf("Effort #%02d: %s\n",
                counter, new Random().nextBoolean());
        } while (--counter != 0);
    }
}

