/**
 * GenericRestrictionDemo2.
 * Restriction of static members.
 */
public class GenericRestrictionDemo2<T> {

    // Compilation error:
    // non-static type variable T cannot be referenced from a static context
    // private static T object;

    // Wrong, no static method can use T.
    // statuc T get getObject() {
    //     return object;
    // }

    public static void main(String[] args) {
        
    }
}


