/**
 * WildcardArgumentDemo2. Demonstrates use of bounded wildcard
 * argument.
 */
public class WildcardArgumentDemo2 {

    public static void main(String[] args) {
        
        CoordsContainer<Coord3D> container3D
            = new CoordsContainer<Coord3D>(new Coord3D[]{new Coord3D(2, 3, 4), new Coord3D(6, 3, 1)});
        
            print2D(container3D);
    }

    public static void print2D(CoordsContainer<? extends Coord2D> container) {
        container.print();
    }
}

class CoordsContainer<T extends Coord2D> {

    private T[] container;

    public CoordsContainer(T[] c) {
        container = c;
    }

    public void print() {
        for(T item : container) {
            item.showXY();
        }
    }
}

class Coord2D {

    private int x, y;

    public Coord2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void showXY() {
        System.out.println(x);
        System.out.println(y);
    }
}

class Coord3D extends Coord2D {
    
    private int z;
    
    public Coord3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public void showXYZ() {
        super.showXY();
        System.out.println(z);
    }
}

class Coord4D extends Coord3D {
    
    private int t; // The time dimension
    
    public Coord4D(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
    
    public void showAllCoords() {
        super.showXYZ();
        System.out.println(t);
    }
}

