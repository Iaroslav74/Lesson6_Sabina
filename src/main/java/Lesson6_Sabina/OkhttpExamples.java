package Lesson6_Sabina;

import com.sun.deploy.nativesandbox.comm.Response;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.util.concurrent.TimeUnit;

public class OkhttpExamples {

    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("gb.ru")
                .addPathSegment("/courses")
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .build();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
