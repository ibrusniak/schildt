
public class _IntersectionType <T extends MyClass0 & MyInterface0> {

    T object;

    public _IntersectionType(T o) {
        object = o;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void showInfo() {
        object.showType();
        object.printPI();
    }
}



