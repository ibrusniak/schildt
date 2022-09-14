import java.util.StringJoiner;

public class ObjectDemo0 {

    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
        
        System.out.println();

        System.out.println(o1.equals(o2)); // false
        System.out.println(o1.equals(o3)); // false
        System.out.println(o2.equals(o3)); // true

        System.out.println();

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);         // true
        System.out.println(a.equals(b));    // true
        System.out.println(a.hashCode());   // 100
        System.out.println(b.hashCode());   // 100

        System.out.println();
        
        String str1 = "foo";
        String str2 = "foo";
        System.out.println(str1 == str2);       // true
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.hashCode());    // 101574
        System.out.println(str2.hashCode());    // 101574
        
        StringJoiner joiner = new StringJoiner(";");
        char[] str1Chars = str1.toCharArray();
        for (char c : str1Chars) {
            joiner.add(String.format("[%1$s %2$d %2$h]", c, (int)c));
        }
        System.out.println(joiner.toString()); // [f 102 66];[o 111 6f];[o 111 6f]
        
        System.out.println();
        
        Double d1 = 200.33d;
        Double d2 = 200.33;
        Double d3 = 200.33d;
        System.out.println("200.33d == 200.33 : " + (200.33d == 200.33)); // true
        System.out.println(d1 == d2);       // false!
        System.out.println(d1 == d3);       // false!
        System.out.println(d2 == d1);       // false!
        System.out.println(d3 == d1);       // false!
        System.out.println(d1.equals(d2));  // true
        System.out.println(d1.equals(d3));  // true
        System.out.println(d1.hashCode());  // 474087244
        System.out.println(d2.hashCode());  // 474087244
        System.out.println(d3.hashCode());  // 474087244
        System.out.println(Double.doubleToLongBits(d1));    // 4641252501824796099
        System.out.println(Double.doubleToLongBits(d3));    // 4641252501824796099
        System.out.println(Double.doubleToLongBits(d2));    // 4641252501824796099
    }
}

