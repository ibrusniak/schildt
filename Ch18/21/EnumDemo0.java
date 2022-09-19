import java.util.Enumeration;

public class EnumDemo0 {
    
    private static enum myEnum1 {
        CONSTANT_1,
        CONSTANT_2,
        CONSTANT_3,
        CONSTANT_4
    }

    public static void main(String[] args) throws Exception {

        enum myEnum2 {
            CONSTANT_21,
            CONSTANT_22,
            CONSTANT_23,
            CONSTANT_24
        }

        System.out.println("myEnum1:");
        for (myEnum1 value : myEnum1.values()) {
            System.out.printf("Value: %s, ordirnal: %s%n", 
            value.name(), value.ordinal());
        }
        
        System.out.println("myEnum2:");
        for (myEnum2 value : myEnum2.values()) {
            System.out.printf("Value: %s, ordirnal: %s%n", 
                value.name(), value.ordinal());
        }
    }
}

