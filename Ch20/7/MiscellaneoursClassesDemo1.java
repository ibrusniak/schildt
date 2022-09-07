import java.util.DoubleSummaryStatistics;

public class MiscellaneoursClassesDemo1 {

    public static void main(String[] args) {
        
        DoubleSummaryStatistics stat1 = new DoubleSummaryStatistics();

        stat1.accept(1);
        stat1.accept(2);
        stat1.accept(3);
        stat1.accept(4);
        
        System.out.println(stat1);
        
        DoubleSummaryStatistics stat2 = new DoubleSummaryStatistics();

        stat2.accept(5);
        stat2.accept(6);
        stat2.accept(7);

        stat1.combine(stat2);

        System.out.println(stat1);
    }
}

