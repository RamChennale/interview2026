package com.selenium.A3_apiInterviewEx;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URI;


public class CRUD_Operations {

    public static void main(String[] args){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.basic("userName","password");
        RestAssured.basePath ="/posts";

        // GETRequest();
        RequestSpecification requestSpecification =  RestAssured.given();
        Response response = requestSpecification.get("/1"); //https://jsonplaceholder.typicode.com/posts/1
        int statusCode = response.getStatusCode();
        //Assert.assertEquals(statusCode, 200);
        System.out.println("GET req response : "+response.getBody());

        if (statusCode==200)
            System.out.println("GET verified successfully");
        else
            System.out.println("GET failed. Expected 200 but got " + statusCode);



        //POSTRequest();
        String resuestData = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        requestSpecification = RestAssured.given()
                .header("Contet-Type", "application/json")
                .body(resuestData);
        Response response1 = requestSpecification.post();

        requestSpecification.post("path", resuestData);
        requestSpecification.post();
//        requestSpecification.post(URI new char[])

        response=  requestSpecification.get();
        response=  requestSpecification.post("url");
        requestSpecification.put("usrl");
        requestSpecification.delete();
        requestSpecification.delete("url");

        String respData =         response.toString();


        int getStatusCode = response1.getStatusCode();
        if (getStatusCode == 201)
            System.out.println("POST verified successfully");
        else
            System.out.println("POST failed "+ getStatusCode);



        //PUTRequest();
        String putResuestData = "{ \"id\": 1, \"title\": \"updated title\", \"body\": \"updated body\", \"userId\": 1 }";

        requestSpecification = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(putResuestData);
        response = requestSpecification.put("/1");
        int putStatusCode = response.getStatusCode();
        if (putStatusCode == 200)
            System.out.println("PUST success "+putStatusCode);
        else
            System.out.println("PUST failed  : "+ putStatusCode);


        //DELETERequest();
        response = requestSpecification.delete("1");
        int deleteStatusCode =response.getStatusCode();
        if( deleteStatusCode== 200)
            System.out.println("DELETE success "+deleteStatusCode);
        else
            System.out.println("DELETE failed  : "+ deleteStatusCode);

    }
}
