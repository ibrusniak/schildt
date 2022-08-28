import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("unchecked")
public class ComparatorDemo3 {
    
    public static void main(String[] args) {
        
        Comparator<String> lastNameComparator = new Comparator<String>() {
            
            @Override
            public int compare(String fullName1, String fullName2) {
                
                int i = fullName1.lastIndexOf(" ");
                int j = fullName2.lastIndexOf(" ");

                String lastName1 = fullName1.substring(i);
                String lastName2 = fullName2.substring(j);

                return lastName1.compareToIgnoreCase(lastName2);
            }
        };

        Comparator<String> firstNameComparator = new Comparator<String>() {
            
            @Override
            public int compare(String fullName1, String fullName2) {
                return fullName1.compareToIgnoreCase(fullName2);
            }
        };

        Comparator humanComparator = lastNameComparator.thenComparing(firstNameComparator);

        TreeSet<String> humans1 = new TreeSet<>(humanComparator);

        humans1.add("John Doe");
        humans1.add("Adam Smith");
        humans1.add("Lilly Doe");
        humans1.add("Arnold Franklyn");
        humans1.add("Terry Sue");
        humans1.add("Rudger Smith");

        for (String s : humans1) {
            System.out.println(s);
        }
    }
}


