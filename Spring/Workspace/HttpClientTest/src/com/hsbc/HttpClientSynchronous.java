package com.hsbc;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class HttpClientSynchronous {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
    
    public static void getMethod() throws IOException, InterruptedException{
    	 HttpRequest request = HttpRequest.newBuilder()
                 .GET()
                 .uri(URI.create("http://localhost:9090/students"))
                 .build();

         HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

         // print status code
         System.out.println(response.statusCode());
         // print response body
         System.out.println(response.body());

    }
    public static void postMethod() throws IOException, InterruptedException{
    	// json formatted data
        String json = new StringBuilder()
                .append("{")
                .append("\"studentId\":\"61\",")
                .append("\"studentName\":\"Test\",")
                .append("\"studentScore\":\"61\"")
                .append("}").toString();

        HttpRequest request = HttpRequest.newBuilder()
        		.POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create("http://localhost:9090/students"))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // print status code
        System.out.println(response.statusCode());

        // print response body
        System.out.println(response.body());
    }
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
    	getMethod();
    	//postMethod();
    }

}