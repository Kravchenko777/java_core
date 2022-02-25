package lesson6.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class ResponseExample {

    public static void main(String[] args) throws IOException {
        URLConnection urlConnection = new URL("http://google.com").openConnection();

        System.out.println(urlConnection.getConnectTimeout());
        System.out.println(urlConnection.getContentType());
        System.out.println(urlConnection.getContentLength());
        System.out.println(urlConnection.getDate());
        try ( InputStream inputStream = urlConnection.getInputStream();){
            int c;
            while ((c = inputStream.read())!=-1){
                System.out.print((char) c);
            }
        }

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://google.com").openConnection();
        System.out.println(httpURLConnection.getResponseCode());
        System.out.println(httpURLConnection.getRequestMethod());
        System.out.println(httpURLConnection.getResponseMessage());
        Map<String, List<String>> headers = httpURLConnection.getHeaderFields();
        for (String k: headers.keySet()) {
            System.out.printf("Ключ: %s, значение: %s \n", k, headers.get(k));
        }


        try ( InputStream inputStream = httpURLConnection.getInputStream();){
            int c;
            while ((c = inputStream.read())!=-1){
                System.out.print((char) c);
            }
        }
    }
}
