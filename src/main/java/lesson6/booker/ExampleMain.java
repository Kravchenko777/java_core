package lesson6.booker;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExampleMain {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();

        /*
        POST https://restful-booker.herokuapp.com/apidoc/index.html

        1. Для начала получим токен авторизации https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth
        */

        String authBodyString = "{" +
                "\"username\": \"admin\", " +
                "\"password\": \"password123\"" +
                "}";
        System.out.println(authBodyString);

        RequestBody authBody = RequestBody.create(authBodyString, MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/auth")
                //            .header("Content-type", "application/json")
                .post(authBody)
                .build();

        Response responseWithToken = client.newCall(request).execute();
        String responseBody = responseWithToken.body().string();

        System.out.println(responseBody);

        String token = responseBody.split(":")[1];
        token = token.replaceAll("[^\\p{L}\\p{Nd}]+", "");

        System.out.println(token);

        /*
        2. Создание бронирования (токен авторизации не обязателен) https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-CreateBooking
        */

        String jsonBody = "{" +
                "\"firstname\" : \"Jim\"," +
                "\"lastname\" : \"Brown\"," +
                "\"totalprice\" : 111, " +
                "\"depositpaid\" : true," +
                "\"bookingdates\" : {" +
                "\"checkin\" : \"2018-01-01\"," +
                "\"checkout\" : \"2019-01-01\" }, " +
                "\"additionalneeds\" : \"Breakfast\" }";


        RequestBody createBookingBody = RequestBody.create(jsonBody, MediaType.parse("application/json"));
        request = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking")
                .addHeader("accept", "application/json")
                .post(createBookingBody)
                .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
