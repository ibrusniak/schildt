import java.util.stream.IntStream;

public class CharSequenceDemo0 {

    public static void main(String[] args) {
        
        CharSequence cs0 = new String("CharSequence demonstration 1");

        IntStream intStream = cs0.chars();

        long spacesCount = intStream
            .filter(x -> x == (int)' ')
            .count();
        
        System.out.println("space count = " + spacesCount);

        "this is the String literal".codePoints()
            .forEachOrdered(x -> System.out.printf(" " + (char)x));
        
        System.out.println();
    }
}

