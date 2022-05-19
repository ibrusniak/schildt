
public class Main {

    public static void main(String[] args) {
        
        // Use method that takes argumen - generic class
        // with bounded type argument
        ValueContainer<String> vcString = new ValueContainer<String>("string value");
        ValueContainer<Integer> vcInteger = new ValueContainer<Integer>(10);
        ValueContainer<Float> vcFloat = new ValueContainer<Float>(305.125f);

        // Type safety in action! This does not compile!
        // error: method toDouble in class ValueContainer<T> cannot be applied to given types;
        // System.out.println(ValueContainer.toDouble(vcString));
        //                                  ^
        // required: ValueContainer<? extends Number>
        // found:    ValueContainer<String>
 
        // System.out.println(ValueContainer.toDouble(vcString));
     

        System.out.println(ValueContainer.toDouble(vcInteger));
        System.out.println(ValueContainer.toDouble(vcFloat));
    }
}

class ValueContainer<T> {

    private T value;

    public ValueContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Notice! This method has generic class parameter with
     * bounded wildcard, so it is
     * type safety and we can call ".doubleValue"! It is great!
     * @param container - ValueContainer, bounded with Number
     * @return double
     */
    public static double toDouble(ValueContainer<? extends Number> container) {
        return container.getValue().doubleValue();
    }
}


