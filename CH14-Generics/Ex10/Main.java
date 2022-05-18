
public class Main {

    public static void main(String[] args) {
        
        Stats<Integer> st1 = new Stats<Integer>(new Integer[] {9, 3, 6});
        Stats<Float> st2 = new Stats<Float>(new Float[] {6f, 9f, 3f});
        System.out.println(st1.average());
        System.out.println(st2.average());
        System.out.println("st1.sameAverage(st2): " + st1.sameAverage(st2));
        System.out.println("st2.sameAverage(st1): " + st2.sameAverage(st1));
    }    
}


