
public class NonGenericEquivalent {

    private Object value;

    public NonGenericEquivalent(Object value) {
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void showType() {
        System.out.println("Type of the value is: " +
                                value.getClass().getName());
    }
}


