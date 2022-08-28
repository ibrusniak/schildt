
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collections;

public class CollectionsDemo2 {

    public static void main(String[] args) {
        
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Q");
        al1.add("F");
        al1.add("D");
        al1.add("A");
        al1.add("W");
        System.out.println(al1);
        
        Collections.shuffle(al1);
        System.out.println(al1);

        Collections.shuffle(al1);
        System.out.println(al1);

        Comparator<String> c = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        Collections.sort(al1, c);
        System.out.println(al1);

        System.out.println();
        System.out.println("Min: " + Collections.min(al1));
        System.out.println("Max: " + Collections.max(al1));

        System.out.println();
        int dFrequency = Collections.frequency(al1, "D");
        System.out.println(dFrequency);
    }
}

