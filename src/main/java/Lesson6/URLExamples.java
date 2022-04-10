package Lesson6;

import java.net.MalformedURLException;
import java.net.URL;

public class URLExamples {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://smirnov:password@gb.ru:80/courses?type=qa&level=super#1");

        System.out.println(url.getProtocol());
        System.out.println(url.getAuthority());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());


    }
}
