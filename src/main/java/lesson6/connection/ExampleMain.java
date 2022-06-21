package lesson6.connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Arrays;

public class ExampleMain {

    public static void main(String[] args) throws IOException {
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(InetAddress.getLocalHost().getHostName());
        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getByName("google.com"));
        Arrays.stream(InetAddress.getAllByName("google.com")).forEach(System.out::println);

        try (Socket socketGoogle = new Socket(InetAddress.getByName("google.com"),443);
             InputStream inputStream = socketGoogle.getInputStream();
             OutputStream outputStream = socketGoogle.getOutputStream()){

            byte[] bytes = "Пошлем запрос в GOOGLE".getBytes();
            outputStream.write(bytes);
            outputStream.flush();
            int answer =0;
            while ((answer = inputStream.read())!=-1){

            }

        }


    }
}