
public class Main {

    public static void main(String[] args) {
        
        System.out.println(new GenCons(10));
        System.out.println(new GenCons(3.14));
        System.out.println(new GenCons(9.8f));
    }
}

class GenCons {

    private double val;

    public <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    @Override
    public String toString() {
        return
            String.format("Instance: %s, val = %s",
                super.toString(),
                val);
    }
}


