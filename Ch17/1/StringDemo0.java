
import java.util.Arrays;

public class StringDemo0 {

    public static void main(String[] args) {

        // String creation
        String string1 = new String();
        String string2 = new String("This is string");
        String string3 = "This is string literal";
        String string4 = new String(new char[]{'f', 'o', 'o'});
        String string5 = String.valueOf(200);
        String string6 = String.valueOf(20.10);
        String string7 = String.valueOf(true);

        println("hello".length());
        println(string2.charAt(0));

        println("hello" == "hello"); // true
        
        String st1 = "hello";
        String st2 = "hello";
        println(st1 == st2);        // true

        st1 += " world";

        println(st1.equals(st2));   // true

        println("HELLO".equals("hello"));   // false
        println("HEllo".equalsIgnoreCase("hello")); // true

        println("object" == "object"); // true

        String source = """
                Often, it is not enough to simply know whether two strings are identical. For
                sorting applications, you need to know which is less than, equal to, or greater
                than the next. A string is less than another if it comes before the other in
                dictionary order.
                """;
        
        println("");
        println(source);
        println("");
        String[] array =
            source.replace(".", "")
                    .replace(",", "")
                    .replace("\n", "")
                    .split(" ");
        
        println(Arrays.toString(array));
        
        Arrays
            .<String>stream(array)
            .sorted()
            .toList()
            .toArray(array);
        
        println(Arrays.toString(array));
        
        // int maxLenght = 0;
        // for (int i = 0; i < array.length; i++) {
        //     if (sorted[i].length() > maxLenght)
        //         maxLenght = sorted[i].lenght();
        // }

        int maxLenght =
            Arrays
                .<String>stream(array)
                .map(x -> x.length())
                .max(Integer::compare)
                .get();

        println(maxLenght);

        // lexicographically sorted
        String format = "[%" + maxLenght + "s]";
        println(format);
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format(format, array[i]));
            if ((i + 1) % 5 == 0)
                println("");
        }
        println("");
    }

    private static <T> void println(T object) {
        System.out.println(object);
    }
}


