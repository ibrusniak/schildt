import static utils.Printers.*;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {
        
        SortedSet<Integer> sortedSet1 = new TreeSet<>(Integer::compare);
        
        sortedSet1.add(2);
        sortedSet1.add(3);
        sortedSet1.add(0);
        sortedSet1.add(6);
        sortedSet1.add(-1);

        println(sortedSet1);
        println(sortedSet1.comparator());

        SortedSet<SomeComparableClass> sortedSet2
            = new TreeSet<>();
        
        sortedSet2.add(new SomeComparableClass(20));
        sortedSet2.add(new SomeComparableClass(10));
        sortedSet2.add(new SomeComparableClass(260));
        sortedSet2.add(new SomeComparableClass(-10));
        sortedSet2.add(new SomeComparableClass(20));

        println(sortedSet2);
    }
}

class SomeComparableClass implements Comparable {

    private int x;
    
    public SomeComparableClass(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int compareTo(Object obj) {
        SomeComparableClass o = (SomeComparableClass) obj;
        if (x > o.getX()) return 1;
        if (x < o.getX()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return
            String.format("{%s %s}", hashCode(), x);
    }
}

