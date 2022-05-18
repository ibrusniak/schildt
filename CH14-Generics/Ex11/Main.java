import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        TwoD twoD = new TwoD(5, 10);
        ThreeD threeD = new ThreeD(2, 3, 6);
        FourD fourD = new FourD(6, 2, 4, 10);

        CoordsStorage<TwoD> storage =
            new CoordsStorage<TwoD>(new TwoD[] {twoD, threeD, fourD});

        printXY(storage);

        System.out.println();

        CoordsStorage<ThreeD> storage2 =
            new CoordsStorage<ThreeD>(new ThreeD[] {threeD, fourD});

        printXYZ(storage2);
    }

    private static void printXY(CoordsStorage<?> storage) {

        TwoD[] coords = storage.getCoords();

        for (TwoD coord : coords) {
            System.out.println(coord + ": " + coord.getX() + ", " + coord.getY());
        }
    }

    private static void printXYZ(CoordsStorage<? extends ThreeD> storage) {

        ThreeD[] coords = storage.getCoords();

        for (ThreeD coord : coords) {
            System.out.println(coord + ": " + coord.getX() + ", " + coord.getY() + ", " + coord.getZ());
        }
    }
}

class CoordsStorage<T extends TwoD> {

    private T[] coords;

    public CoordsStorage(T[] coords) {
        this.coords = coords;
    }

    public T[] getCoords() {
        return coords;
    }
}

class TwoD {

    private int x, y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class ThreeD extends TwoD {

    private int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}

class FourD extends ThreeD {

    private int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public int getT() {
        return t;
    }
}


