
public class Main {

    public static void main(String[] args) {
        
        SimpleClass sc = new SimpleClass(new Object());
        GenericClass<String> gcString = new GenericClass<String>("Hello");
        GenericClass<Integer> gcInteger = new GenericClass<Integer>(100);

        System.out.println();
        
        System.out.println("SimpleClass: " + sc);
        System.out.println("GenericClass<String>: " + gcString);
        System.out.println("GenericClass<Integer>: " + gcInteger);

        System.out.println();
        
        System.out.println("SimpleClass type: " + sc.getClass().getName());
        System.out.println("GenericClass<String> type: " + gcString.getClass().getName());
        System.out.println("GenericClass<Integer> type: " + gcInteger.getClass().getName());
        
        System.out.println();

        System.out.println("gcString instanceof GenericClass: " + (gcString instanceof GenericClass));
        System.out.println("gcString instanceof GenericClass<String>: " + (gcString instanceof GenericClass<String>));

        // error: incompatible types: GenericClass<String> cannot be converted to GenericClass<Integer>
        // System.out.println("sc instanceof GenericClass: " + (gcString instanceof GenericClass<Integer>));
    }   
}


