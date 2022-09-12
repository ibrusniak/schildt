import java.lang.Runtime.Version;
import java.util.List;

public class RuntimeVersion {

    public static void main(String[] args) {

        Runtime.Version v = Runtime.version();

        System.out.println(v);
        System.out.printf("feature: %s%ninterim %s%nupdate %s%npatch %s%n",
            v.feature(),
            v.interim(),
            v.update(),
            v.patch());
    }
}

