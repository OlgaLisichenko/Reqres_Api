package Api;

import io.restassured.response.Response;
import utils.PropertyReader;

import static io.restassured.RestAssured.given;

public class BaseApi {

    PropertyReader reader = new PropertyReader();

    protected Response get(String uri, int statusCode) {
        return given().
                when().
                        get(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(statusCode).
                        extract().response();
    }

    protected Response post(String body, String uri, int statusCode) {
        return given().
                        contentType("application/json").
                        body(body).
                when().
                        post(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(statusCode).
                        extract().response();
    }

    protected Response put(String body, String uri) {
        return given().
                        contentType("application/json").
                        body(body).
                when().
                        put(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(200).
                        extract().response();
    }

    protected Response patch(String body, String uri) {
        return given().
                        contentType("application/json").
                        body(body).
                when().
                        patch(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(200).
                        extract().response();
    }

    protected void delete(String uri) {
                 given().
                 when().
                        delete(reader.getBaseUrl() + uri).
                 then().
                        log().all().
                        statusCode(204);
    }
}
