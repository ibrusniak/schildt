
public class GenericClass<K> {

    private K value;

    public GenericClass(K value) {
        this.value = value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public K getValue() {
        return value;
    }
}


