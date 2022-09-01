import java.util.Random;

public class RandomDemo1 {

    public static void main(String[] args) {

        new Random().ints()
            .limit(10)
            .forEach(System.out::println);
        
        System.out.println();

        Random rnd = new Random();

        System.out.println(rnd.nextExponential());
        System.out.println(rnd.nextGaussian());
    }
}
