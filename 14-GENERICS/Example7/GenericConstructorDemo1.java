/**
 * GenericConstructorDemo1
 */
public class GenericConstructorDemo1 {

    public static void main(String[] args) {
        
        Person john = new Person("John", 2000);
        System.out.println(john);
        john.setSalary(2500f);
        System.out.println(john);
    }
}

class Person {

    private String name;
    private double salary;

    public <T extends Number> Person(String name, T salary) {
        this.name = name;
        this.salary = salary.doubleValue();
    }

    public <T extends Number> void setSalary(T salary) {
        this.salary = salary.doubleValue();
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("[%s (%s)]", name, salary);
    }
}

