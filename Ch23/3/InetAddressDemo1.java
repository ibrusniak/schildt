
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo0 {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress[] allGoogle = InetAddress.getAllByName("www.google.com");

        for(InetAddress addr : allGoogle) {
            System.out.println(addr);
        }

        for(InetAddress addr : InetAddress.getAllByName("www.nba.com")) {
            System.out.println(addr);
        }
    }
}

