
package app;

public class Application {

    public static void main(String[] args) {
        
        Accessories utils = new Accessories();

        utils.util0();
        utils.util1();

        pack.Class0 cl0 = new pack.Class0();

        // someMethod0() has protected access in Class0
        // cl0.someMethod0();

        // someMethod1() is not public in Class0;
        // cannot be accessed from outside package
        // cl0.someMethod1();

        cl0.someMethod2();
    }    
}

