
public class EnumDemo {
    
    public static void main(String[] args) {

        enum color {
            RED,
            GREEN,
            BLUE
        }

        enum day {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THYRSDAY,
            FRIDAY
        }

        var values = color.values();
        var value = color.valueOf("BLUE");

        for (color c : values)
            System.out.println(c);

        System.out.println(value);
        System.out.println(color.RED);
    }
}
