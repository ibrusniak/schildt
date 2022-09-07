
public class InnerClassTest {

    public static void main(String[] args) {
        
        var person = getPerson();

        System.out.println(person.getClass());
        // class InnerClassTest$1Person

        var cube = getCube();
        System.out.println(cube.getClass());
        // class InnerClassTest$1Cube

        var animal = new Animal();
        System.out.println(animal.getClass());
        // class InnerClassTest$Animal
    }

    private static Object getPerson() {
        
        class Person {}
        return new Person();
    }

    private static Object getCube() {

        class Cube {}
        return new Cube();
    }

    private static class Animal {}
}

