package Api;

import io.restassured.response.Response;
import utils.PropertyReader;

import static io.restassured.RestAssured.given;

public class BaseApi {

    PropertyReader reader = new PropertyReader();

    protected String get(String uri) {
        return given().
                when().
                        get(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(200).
                        extract().body().asString();
    }

    protected String getWithStatus404(String uri) {
        return given().
                when().
                        get(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(404).
                        extract().body().asString();
    }

    protected Response postWithStatus201(String body, String uri) {
        return given().
                        contentType("application/json").
                        body(body).
                when().
                        post(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(201).
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

    protected Response postWithStatus200(String body, String uri) {
        return given().
                        contentType("application/json").
                        body(body).
                when().
                        post(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(200).
                        extract().response();
    }

    protected Response postWithStatus400(String body, String uri) {
        return given().
                        contentType("application/json").
                        body(body).
                when().
                        post(reader.getBaseUrl() + uri).
                then().
                        log().all().
                        statusCode(400).
                        extract().response();
    }
}
