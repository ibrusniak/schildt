
public class AnnotationDemo0 {

    public static void main(String[] args) {

        documentedMethod();
        deprecatedMethod();
    }

    /** 
    * @deprecated
    * this method is deprecated (for testing purpose)
    */
    @Deprecated
    private static void deprecatedMethod() {}

    /**
     * documentedMethod
     * @return void
     */
    private static void documentedMethod() {}
}

