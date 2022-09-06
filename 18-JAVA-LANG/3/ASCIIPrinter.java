import java.io.PrintStream;

/**
 * 
 * ASCII codes from 33 to 126
 * 
 * [21 33   !][22 34   "][23 35   #][24 36   $][25 37   %][26 38   &]
 * [27 39   '][28 40   (][29 41   )][2A 42   *][2B 43   +][2C 44   ,]
 * [2D 45   -][2E 46   .][2F 47   /][30 48   0][31 49   1][32 50   2]
 * [33 51   3][34 52   4][35 53   5][36 54   6][37 55   7][38 56   8]
 * [39 57   9][3A 58   :][3B 59   ;][3C 60   <][3D 61   =][3E 62   >]
 * [3F 63   ?][40 64   @][41 65   A][42 66   B][43 67   C][44 68   D]
 * [45 69   E][46 70   F][47 71   G][48 72   H][49 73   I][4A 74   J]
 * [4B 75   K][4C 76   L][4D 77   M][4E 78   N][4F 79   O][50 80   P]
 * [51 81   Q][52 82   R][53 83   S][54 84   T][55 85   U][56 86   V]
 * [57 87   W][58 88   X][59 89   Y][5A 90   Z][5B 91   [][5C 92   \]
 * [5D 93   ]][5E 94   ^][5F 95   _][60 96   `][61 97   a][62 98   b]
 * [63 99   c][64 100  d][65 101  e][66 102  f][67 103  g][68 104  h]
 * [69 105  i][6A 106  j][6B 107  k][6C 108  l][6D 109  m][6E 110  n]
 * [6F 111  o][70 112  p][71 113  q][72 114  r][73 115  s][74 116  t]
 * [75 117  u][76 118  v][77 119  w][78 120  x][79 121  y][7A 122  z]
 * [7B 123  {][7C 124  |][7D 125  }][7E 126  ~]
 */
public class ASCIIPrinter {

    private static final int START = 0x21;      // 33
    private static final int END = 0x7E;        // 126
    private static final String FNAME = "ASCIIPrinterOutput.txt";
    private static final String INFO = "\n[HEX INT SYMBOL]\n\n";

    public static void main(String[] args) {
        System.out.println(INFO);
        try(PrintStream ps = new PrintStream(FNAME)) {
            ps.print(INFO);
            int lfcounter = 0;
            for (int i = START; i <= END; i++) {
                String s = String.format("[%1$-3H%1$-5d%2$1s]",
                    i, (char)i);
                if (lfcounter++ == 5) {
                    s += '\n';
                    lfcounter = 0;
                }
                System.out.print(s);
                ps.print(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

