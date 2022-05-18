
public class Main {

    public static void main(String[] args) {
        
        Integer[] intArray = new Integer[] {1, 2, 3, 4, 5};
        Byte[] byteArray = new Byte[] {1, 2, 3, 4, 5};
        Float[] floatArray = new Float[] {1f, 2f, 3f, 4f, 5f};
        Double[] doubleArray = new Double[] {1d, 2d, 3d, 4d, 5d};

        System.out.println();

        println(intArray.toString() + ": " +
            new GenericClassWithBoundedTypeParameter<Integer>(intArray).average());
        println(byteArray.toString() + ": " +
            new GenericClassWithBoundedTypeParameter<Byte>(byteArray).average());
        println(floatArray.toString() + ": " +
            new GenericClassWithBoundedTypeParameter<Float>(floatArray).average());
        println(doubleArray.toString() + ": " +
            new GenericClassWithBoundedTypeParameter<Double>(doubleArray).average());
    }

    private static <T> void println(T message) {
        System.out.println(message);
    }
}


