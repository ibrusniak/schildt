
import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo1 {
    
    public static void main(String[] args) {

        System.out.println("null == null: " + (null == null)); // true
        System.out.println("null != null: " + (null != null)); // false

        // We can not do this because operator > is undefined
        // for arguments null, null
        // System.out.println("null != null: " + (null > null));
        
        var letters = new ArrayList<String>();

        letters.add("q");
        letters.add("c");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("f");
        letters.add(null);
        letters.add(null);

        System.out.println(letters);
        letters.remove("f");
        letters.remove("f");
        letters.remove(null);
        System.out.println(letters); 
    }
}
