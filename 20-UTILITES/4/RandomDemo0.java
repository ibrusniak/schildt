import java.util.Random;

public class RandomDemo0 {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(10));

        for (int i = 0; i < 40; i++) {
            System.out.print(rnd.nextInt(11) + " ");
        }
        
        System.out.println("\n\n");

        // Experiment: the same seed - the same
        // 'random' sequence. Forever.
        long seed = 10l;
        Random rnd1 = new Random(seed);
        Random rnd2 = new Random(seed);

        int counter = 20;
        while (--counter >= 0) {
            System.out.print(rnd1.nextInt(1000) + " ");
        }
        System.out.println();
        counter = 20;
        while (--counter >= 0) {
            System.out.print(rnd2.nextInt(1000) + " ");
        }
        System.out.println();
    }
}
