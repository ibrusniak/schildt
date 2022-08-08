import java.util.EnumSet;

public class EnumSetDemo1 {
    
    private enum color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        MAGENTA
    }

    private static <T> void println(T o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        
        EnumSet<color> eset = EnumSet.allOf(color.class);
        println(eset);
        eset.clear();
        println(eset);
        eset = EnumSet.range(color.GREEN, color.MAGENTA);
        println(eset);
        eset.remove(color.MAGENTA);
        println(eset);

        println("");
        
        eset.stream()
            .forEach(System.out::print);
    }
}

