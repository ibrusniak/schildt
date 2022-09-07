import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {

        test1();
        test2();
    }

    private static void test1() {
          
        System.out.println();
      
        var names = new HashSet<String>();

        names.add("Pete");
        names.add("Dunkan");
        names.add("Rudger");

        // Pass-by-value. So we can not add
        // the same string to the set. Sets
        // are not allow dublicates.
        names.add("Pete");

        System.out.println("names size: " + names.size()); // 3
        System.out.println(names); // Dont know. It is unordered
    }

    private static void test2() {
        
        System.out.println();

        class Person {

            private String name;
            Person(String n) { name = n; }

            @Override
            public String toString() {
                return this.name;
            }
        }

        var people = new HashSet<Person>();

        // Pass-by-reference
        people.add(new Person("Pete"));
        people.add(new Person("Dunkan"));
        people.add(new Person("Rudger"));
        people.add(new Person("Pete"));

        System.out.println("people size: " + people.size()); // 4
        System.out.println(people);
    }
}

