import java.util.HashSet;

public class HashSetDemo2 {
    
    public static void main(String[] args) {
        
        var items = new HashSet<GameItem>();

        items.add(new GameItem("power cube"));
        items.add(new GameItem("piece of bread"));
        items.add(new GameItem("combat knife"));

        System.out.println(items); // [power cube]

        // items.size() = 1 because of overrided the equals and
        // the hashCode methods in the GameItem. So any instance
        // is equals any other instance. So JVM can not distinguish
        // one instance from another
        System.out.println("size: " + items.size()); // magic!
    }

    private static class GameItem {

        private String name;

        GameItem(String n) { name = n; }
        
        @Override
        public String toString() {
            return name;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }
}


