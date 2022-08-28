import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class ComparatorDemo2 {
    
    public static void main(String[] args) {
        
        // Using thenComparing() to create a comparator that compares
        // last names, then compares entire name when last names match.
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst =
            compLN.thenComparing(new CompThenByFirstName());
        
        TreeMap<String, Double> tm =
            new TreeMap<>(compLastThenFirst);
        
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1278.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();
    }
}

class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        
        int i, j;

        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');

        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

