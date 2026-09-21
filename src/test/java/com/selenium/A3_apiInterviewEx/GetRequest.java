package com.selenium.A3_apiInterviewEx;

import org.openqa.selenium.devtools.latest.network.model.Response;
import org.testng.annotations.Test;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class GetRequest {

    @Test
    public static void getUserReq(){


                given()
                .when()
                        .get("https://reqres.in/api/unknown/1")
                .then()

                        .log().all();
    }



}
