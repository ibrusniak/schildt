import java.util.Random;

public class SystemDemo0 {

    public static void main(String[] args) {

        final int elementsCount = 100_000_000;
        int test = 0;
        
        while (++test <= 10) makeTest(elementsCount, test);
    }
    
    private static void makeTest(int elementsCount, int test) {
        
        Object[] source = new Integer[elementsCount];
        Object[] target = new Integer[elementsCount];
    
        for (int i = 0; i < elementsCount; i++) {
            source[i] = new Random().nextInt();
        }
    
        long point1 = System.nanoTime();
        myArrayCoppy(source, 0, target, 0, source.length);
        long point2 = System.nanoTime();
        long myArrayCoppySpeed = point2 - point1;
        
        target = new Integer[elementsCount];
        System.gc();
    
        point1 = System.nanoTime();
        System.arraycopy(source, 0, target, 0, source.length);
        point2 = System.nanoTime();
        long systemArrayCopySpeed = point2 - point1;

        System.out.printf("%5d%,20d%,20d%10.2f%n"
            , test, myArrayCoppySpeed, systemArrayCopySpeed,
            (double)myArrayCoppySpeed / (double)systemArrayCopySpeed);

        System.gc();
    }

    private static void myArrayCoppy(
        Object[] src, int srcPos,
        Object[] dest, int destPos, int length) {
        
        for (int i = srcPos; i < length; i++) {
            if (i == dest.length) return;
            dest[i] = src[i];
        }
    }
}

