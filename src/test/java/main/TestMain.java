package main;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

public class TestMain {
    public static void main(String[] args) {
//        Properties properties = System.getProperties();
//        properties.get("os.name");
//        System.out.println(properties);
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String s = localHost.toString();
            System.out.println("....");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
