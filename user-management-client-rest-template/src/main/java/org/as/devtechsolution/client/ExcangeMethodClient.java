package org.as.devtechsolution.client;

import java.util.List;

import org.as.devtechsolution.dto.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ExcangeMethodClient {
	
	static RestTemplate restTemplate = new RestTemplate();
    static String baseUrl = "http://localhost:8083/springData/";


    //@Autowired
   // private static ForEntityMethodOfRestTemplateDemo forEntityMethodOfRestTemplateDemo;

//    public static void main(String[] args) {
//        //SpringApplication.run(UserManagementClient.class, args);
//        
//
////        ForEntityMethodOfRestTemplateDemo forEntityMethodOfRestTemplateDemo = new ForEntityMethodOfRestTemplateDemo();
////        fuseExchangeMethodsOfRestTemplate();orEntityMethodOfRestTemplateDemo.driverMethod();
////        ForObjectMethodOfRestTemplateDemo forObjectMethodOfRestTemplateDemo = new ForObjectMethodOfRestTemplateDemo();
////        forObjectMethodOfRestTemplateDemo.driverMethod();
//    }

    public static void useExchangeMethodsOfRestTemplate() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> requestEntity = new HttpEntity<>(headers);

        getSingleUserByExchangeMethod(requestEntity);
       // getListUserByExchangeMethod(requestEntity);

        User sysUser = new User();
        sysUser.setFirstName("Arvind");
        sysUser.setLastName("Kuamr");
        sysUser.setAddress("Noida");
        sysUser.setGender("M");
        //requestEntity = new HttpEntity<>(sysUser, headers);

        //addUserByExchangeMethod(requestEntity);

        //updateUserByExchangeMethod(requestEntity);

        //deleteUserByExchangeMethod(requestEntity);
    }

    public static void deleteUserByExchangeMethod(HttpEntity<User> requestEntity) {
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl + "user/21",
                HttpMethod.DELETE,
                requestEntity,
                String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        String userDetails = responseEntity.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }

    public static void updateUserByExchangeMethod(HttpEntity<User> requestEntity) {
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl + "updateAddress/21/Delhi",
                HttpMethod.PUT,
                requestEntity,
                String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        String userDetails = responseEntity.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }

    public static void addUserByExchangeMethod(HttpEntity<User> requestEntity) {
        ResponseEntity<User> responseEntity = restTemplate.exchange(baseUrl + "user",
                HttpMethod.POST,
                requestEntity,
                User.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        User userDetails = responseEntity.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }


    public static void getListUserByExchangeMethod(HttpEntity<Object> requestEntity) {
        ResponseEntity<List> responseEntity = restTemplate.exchange(baseUrl + "users",
                HttpMethod.GET,
                requestEntity,
                List.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        List user = responseEntity.getBody();
        System.out.println("response body - " + user);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
/*
        ResponseEntity<User> responseUser = restTemplate.exchange(baseUrl + "user/5",
                HttpMethod.GET,
                requestEntity,
                User.class);
        User userBody = responseUser.getBody();
        System.out.println("user object - " + userBody);*/
    }

    public static void getSingleUserByExchangeMethod(HttpEntity<Object> requestEntity) {
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl + "user/1",
                HttpMethod.GET,
                requestEntity,
                String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        String user = responseEntity.getBody();
        System.out.println("response body - " + user);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);

        ResponseEntity<User> responseUser = restTemplate.exchange(baseUrl + "user/1",
                HttpMethod.GET,
                requestEntity,
                User.class);
        User userBody = responseUser.getBody();
        System.out.println("user object - " + userBody);
    }

}
