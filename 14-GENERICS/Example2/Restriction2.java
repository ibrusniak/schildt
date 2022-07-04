/**
 * Restriction2. Generic types Differ Based
 * on Their Type Arguments.
 */
public class Restriction2 {

    public static void main(String[] args) {
        
        Gen<String> genString1 = new Gen<String>();
        System.out.println(genString1);
        Gen<Integer> genInteger1 = new Gen<Integer>();
        System.out.println(genInteger1);

        // This will occurs a compilation error.
        // Cannot convert Gen<Integer> to Gen<String>
        // genString1 = genInteger1;
    }
}

class Gen<T> {}

