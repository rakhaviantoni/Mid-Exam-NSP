package softcode;
import java.util.Scanner;
import java.net.*;

public class rvp1 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Web : ");
    String website = scanner.next();

    if (website.length() < 0) {
      System.err.println ("Please input the right domain");
      System.exit(0);
    }
      System.out.println ("Resolving " + website);
      try {
        // Resolve host and get InetAddress
        InetAddress addr = InetAddress.getByName( website );
        System.out.println ("Hostname/IPaddress : " + addr.getHostName() + "/" + addr.getHostAddress() );
        System.out.println ("Canonical : " + addr.getCanonicalHostName() );
      }
        catch (UnknownHostException uhe)
      {
        System.out.println ("Error - unable to resolve hostname" );
    }
  }
}