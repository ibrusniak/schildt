import java.util.EnumSet;

public class EnumSetDemo {
    
    public static void main(String[] args) {
        
        EnumSet<Gfg> set1, set2, set3, set4;
        
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRUBUTE,
        Gfg.LEARN, Gfg.CODE);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(Gfg.class);
        set4 = EnumSet.range(Gfg.LEARN, Gfg.CONTRUBUTE);
        
        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);
        System.out.println("set3 " + set3);
        System.out.println("set4 " + set4);

        System.out.println();
        System.out.println(Gfg.class);
        System.out.println(Gfg.class.isEnum());
    }
}

enum Gfg { CODE, LEARN, CONTRUBUTE, QUIZ, MCQ };

