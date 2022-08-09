
import java.util.ArrayList;

public class SpliteratorDemo2 {
    
    public static void main(String[] args) {
        
        var letters = new ArrayList<String>();
        
        for (Character ch = 'A'; ch <= 'Z'; ch++)
            letters.add(ch.toString());
        
        System.out.println("letters: " + letters);
        System.out.println("letters.size(): " + letters.size());

        var spliterator = letters.spliterator();

        System.out.print("spliterator.tryAdvance(): ");
        while (spliterator.tryAdvance(System.out::print));
        
        System.out.println("\n\n");
        
        var sp1 = letters.spliterator();
        var sp3 = sp1.trySplit();
        var sp2 = sp1.trySplit();
        var sp4 = sp3.trySplit();

        while (sp1.tryAdvance(System.out::print));
        System.out.println();
        while (sp2.tryAdvance(System.out::print));
        System.out.println();
        while (sp3.tryAdvance(System.out::print));
        System.out.println();
        while (sp4.tryAdvance(System.out::print));
        System.out.println();
    }
}

