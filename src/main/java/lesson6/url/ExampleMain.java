package lesson6.url;

import java.net.MalformedURLException;
import java.net.URL;

public class ExampleMain {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://google.com/some?query='test'");
        URL url2 = new URL("https", "google.com", 443, "/some?query='test'");


        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getQuery());
        System.out.println(url.getFile());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(url2.getProtocol());
        System.out.println(url2.getHost());
        System.out.println(url2.getPort());
        System.out.println(url2.getDefaultPort());
        System.out.println(url2.getQuery());
        System.out.println(url2.getFile());
    }
}
