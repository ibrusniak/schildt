/**
 * GenericMethodDemo3 - demonstrates how to work with generic methods
 */
public class GenericMethodDemo3 {

    public static void main(String[] args) {
        
        Integer[] intArray = new Integer[] {2, 5, 1, 0, 20, 11, 6};
        
        printArray(intArray);
        printArray(GenericMethodDemo3.<Integer>sortArray(intArray));

        Double[] doubleArray = new Double[] {6.2, 0.2, -2d, -9d, 5.6};
        
        GenericMethodDemo3.<Double>printArray(doubleArray);
        printArray(GenericMethodDemo3.<Double>sortArray(doubleArray));
        printArray(sortArray(doubleArray));

        Person[] persons = new Person[4];
        persons[0] = new Person("John", 3000);
        persons[1] = new Person("Roopert", 6000);
        persons[2] = new Person("Rudger", 20000);
        persons[3] = new Person("Lily", 3500);

        printArray(persons);
        printArray(sortArray(persons));

        persons[0].setSalary(3250);
        persons[3].setSalary(5500);
        printArray(persons);
        printArray(sortArray(persons));
    }

    public static <T extends Comparable<T>> T[] sortArray(T[] array) {
        
        T[] result = array;
        
        if (array.length > 1) {
            for (int c = 0; c < array.length; c++) {
                for (int i = 1; i < array.length; i++) {
                    if(array[i - 1].compareTo(array[i]) == 1) {
                        T t = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = t;
                    }
                }
            }
        }

        return result;
    }

    public static <T> void printArray(T[] array) {

        for (T t : array) {
            System.out.print(t + " ");
        }
        
        System.out.println();
    }
}

class Person implements Comparable<Person> {

    private String name;
    private int salary;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int compareTo(Person o) {
        if (salary > o.salary) {
            return 1;
        } else if (salary < o.salary) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("[%s (%d)]", name, salary);
    }
}

