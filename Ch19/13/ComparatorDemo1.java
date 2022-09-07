import java.util.Comparator;
import java.util.TreeSet;
import java.util.HashSet;

public class ComparatorDemo1 {

    public static void main(String[] args) {

        TreeSet<Integer> tset1 = new TreeSet<>(Integer::compare);
        tset1.add(20);
        tset1.add(3);
        tset1.add(15);
        tset1.add(1);

        System.out.println(tset1); // [1, 3, 15, 20]

        Comparator<Integer> reverseComp = Comparator.reverseOrder();
        TreeSet<Integer> tset2 = new TreeSet<>(reverseComp);
        tset2.addAll(tset1);

        System.out.println(tset2); // [20, 15, 3, 1]

        
    }
}
