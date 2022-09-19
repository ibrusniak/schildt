

import java.util.Arrays;

public class PackageDemo0 {

    public static void main(String[] args) {
        
        Arrays.asList(Package.getPackages()).stream()
            .map(p -> p.getName())
            .sorted()
            .forEach(System.out::println);
    }
}

