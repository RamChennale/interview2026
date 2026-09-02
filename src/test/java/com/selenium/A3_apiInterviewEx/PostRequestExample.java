package com.selenium.A3_apiInterviewEx;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class PostRequestExample {
    public static void main(String[] args){
        RestAssured.baseURI = "https://reqres.in/api";

        String requestBody = "{ \"name\": \"John\", \"job\": \"QA Engineer\" }";

        Response response = given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .extract().response();

        System.out.println("Response Body: " + response.asString());
        System.out.println("Status Code: " + response.getStatusCode());


       /* RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.basic("userName","password");
        RestAssured.basePath ="/posts";
*/
        //POSTRequest();
        String resuestData = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        RequestSpecification requestSpecification = RestAssured
                .given()
                .header("Contet-Type", "application/json")
                .body(resuestData);
        Response response1 = requestSpecification.post("https://jsonplaceholder.typicode.com/posts");
        int getStatusCode = response1.getStatusCode();
        if (getStatusCode == 201)
            System.out.println("POST verified successfully");
        else
            System.out.println("POST failed "+ getStatusCode);
    }


}
