import java.util.StringJoiner;
import java.util.UUID;

public class MiscellaneoursClassesDemo0 {
 
    public static void main(String[] args) {
        
        StringJoiner sJoiner1
            = new StringJoiner(", ", "[", "]");
        
        sJoiner1
            .add("FOO")
            .add("BAR")
            .add("BAZ");
        
        System.out.println(sJoiner1); // [FOO, BAR, BAZ]

        StringJoiner sJoiner2
            = new StringJoiner("");

        sJoiner2
            .add("postElement");
        
        System.out.println(sJoiner2); // [FOO, BAR, BAZ, postElement]

        sJoiner1.merge(sJoiner2);

        System.out.println(sJoiner1);

        CharSequence charSequence = new String("ABCDFGH");
        System.out.println(charSequence.charAt(3));
        CharSequence subSequence = charSequence.subSequence(0, 3);
        System.out.println(subSequence);

        System.out.println();

        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
    }
}
