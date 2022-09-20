import java.util.StringJoiner;

public class ComparableDemo0 {
    
    public static void main(String[] args) {
        
        Integer[] array0 = new Integer[] {23, 0, -1, 200, 4, 2};

        printArray(array0);
        printArray(sortArray(array0));
        
        Double[] array1 = new Double[] {2.3, 0.1, -3d, 0d, 10d, -12.3};

        printArray(array1);
        printArray(sortArray(array1));

        class My implements Comparable<My> {

            @Override
            public int compareTo(My which) {
                return Integer.compare(hashCode(), which.hashCode());
            }

            @Override
            public String toString() {
                return String.format("{%15s}", "My_" + hashCode());
            }
        }

        My[] array3 = new My[] {new My(), new My(), new My(), new My(), new My(), new My()};

        printArray(array3);
        printArray(sortArray(array3));
    }

    private static <T extends Comparable<T>> T[] sortArray(T[] initial) {

        T[] copy = initial;

        for (int j = 0; j < copy.length; j++) {
            
            for (int i = 1; i < copy.length; i++) {
                
                if (copy[i].compareTo(copy[i-1]) == -1) {
                    T el = copy[i];
                    copy[i] = copy[i-1];
                    copy[i-1] = el;
                }
            }
        }
        return copy;
    }

    private static <T> void printArray(T[] array) {
        
        StringJoiner j = new StringJoiner(", ",
            array.getClass().getSimpleName() + " [", "]");

        for (int i = 0; i < array.length; i++) {
            j.add(array[i].toString());
        }

        System.out.println(j);
    }
}

