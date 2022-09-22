
import java.net.InetAddress;

public class InetAddressDemo0 {

    public static void main(String[] args) throws Exception {

        showAddressInfo("localhost");
        showAddressInfo("unreachable-host.org");
        showAddressInfo("www.example.com");
        showAddressInfo("example.com");
        showAddressInfo("www.google.com");
    }

    private static void showAddressInfo(String url) {

        InetAddress address;

        try {
            address = InetAddress.getByName(url);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
            return;
        }

        String isReachable = "true";

        try {
            address.isReachable(3);
        } catch (Exception e) {
            isReachable = e.getMessage();
        }

        System.out.printf("""

            toString: %s
            canonical host name: %s
            host address: %s
            is reachable: %s
            """,
            address.toString(),
            address.getCanonicalHostName(),
            address.getHostAddress(),
            isReachable);
    }
}

