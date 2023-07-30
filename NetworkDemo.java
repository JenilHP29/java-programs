import java.net.*;
public class NetworkDemo
{
    public static void main(String args[]) throws Exception
    {
        InetAddress inet = InetAddress.getLocalHost();
        System.out.println("Ip: "+inet);

        InetAddress inet1 = InetAddress.getByName("localhost");
        System.out.println("Ip: "+inet1);

        InetAddress inet2 = InetAddress.getByName("LAPTOP-BO43NTR0");
        System.out.println("Ip: "+inet2);
    }
}