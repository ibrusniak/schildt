import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemDemo3 {
    
    public static void main(String[] args) throws Exception {

        var ps = new PrintStream("props.out");
        var props = getPropnames();
        props.forEach(p ->
            ps.printf("%30s: %s%n",
                p, System.getProperty(p)));
        
        ps.close();
    }
    
    private static List<String> getPropnames() {

        return new ArrayList<String>(Arrays.asList(
            """
            path.separator
            file.separator
            line.separator
            java.class.path
            java.class.version
            java.compiler
            java.home
            java.io.tmpdir
            java.library.path
            java.spacification.name
            java.specification.vendor
            java.specification.version
            java.vendor        
            java.vendor.url  
            java.vendor.version
            java.version
            java.version.date
            java.vm.name
            java.mv.specification.name
            java.mv.specification.vendor
            java.mv.specification.version
            java.vm.vendor
            java.vm.version
            os.arch
            os.name
            os.version
            user.dir
            user.home
            user.name
            """.split("\\n")));
    }
}
