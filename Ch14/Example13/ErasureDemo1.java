
public class ErasureDemo1<T> {

    private T value1;
    private T value2;

    public void printValues() {
        System.out.println(value1);
        System.out.println(value2);
    }

    public static <T> ErasureDemo1<T> createAdnAdd2Values(Object o1, Object o2) {
        ErasureDemo1<T> result = new ErasureDemo1<>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return result;
    }

    public static void main(String[] args) {
        Double d = 34.34;
        String s = "Test";
        ErasureDemo1<Integer> test
            = ErasureDemo1.<Integer>createAdnAdd2Values(d, s);
        test.printValues();
    }
}


