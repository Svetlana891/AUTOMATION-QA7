package myLesson1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TryGetRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
//        given()
//                .when()
//                .get("/api/user/2")
//                .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON);
        Response response = RestAssured.get("/api/user/2");
        String responseString = response.getBody().asString();
        System.out.println(responseString);



    }
}
