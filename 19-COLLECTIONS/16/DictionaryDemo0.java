import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;

public class DictionaryDemo0 {
    
    public static void main(String[] args) {

        Dictionary<Integer, String> legacyMap = new Hashtable<>();

        legacyMap.put(1, "First");
        legacyMap.put(2, "Two");
        legacyMap.put(3, "Three");

        System.out.println(legacyMap.size());
        System.out.println(legacyMap);
        
        HashMap<Integer, String> modernMap = new HashMap<>();
        
        modernMap.put(1, "First");
        modernMap.put(2, "Two");
        modernMap.put(3, "Three");
    
        System.out.println(modernMap.size());
        System.out.println(modernMap);

        Set<Integer> modernKeySet = modernMap.keySet();
        Iterator<Integer> moderKeySetIterator = modernKeySet.iterator();

        while (moderKeySetIterator.hasNext()) {
            System.out.print(" " + moderKeySetIterator.next());
        }
        System.out.println();

        Enumeration<Integer> legacyKeysEnumeration
            = legacyMap.keys();

        while (legacyKeysEnumeration.hasMoreElements()) {
            System.out.print(" " + legacyKeysEnumeration.nextElement());
        }
        System.out.println();
    }
}

