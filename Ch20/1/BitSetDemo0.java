import java.util.BitSet;

public class BitSetDemo0 {
    
    public static void main(String[] args) {
        
        BitSet bitSet1 = new BitSet(32);

        System.out.println(bitSet1);
        
        bitSet1.set(4);
        bitSet1.set(32);

        System.out.println(bitSet1);
        
    }
}
