
public class AutoCloseableDemo0 {

    public static void main(String[] args) {
        
        class SomeClass implements AutoCloseable {

            public void close() throws Exception {
                System.out.println(this + " closed");
            }
        }

        try (SomeClass sc = new SomeClass()) {
            
        } catch (Exception e) {
            
        }

        // Output:
        // AutoCloseableDemo0$1SomeClass@15b3e5b closed
        // (the hash may differ)
    }
}

