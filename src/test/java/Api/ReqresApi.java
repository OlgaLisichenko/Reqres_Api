package Api;

import com.google.gson.Gson;
import dto.*;
import utils.TestConstants;

import static java.net.HttpURLConnection.*;

public class ReqresApi extends BaseApi implements TestConstants {

    Gson gson = new Gson();

    public ListUsers getUsersList() {
        return gson.fromJson(get(URI_USER + "?page=2", HTTP_OK).asString(), ListUsers.class);
    }

    public User getSingleUser() {
        return gson.fromJson(get(URI_USER + "/" + USER_ID, HTTP_OK).asString(), User.class);
    }

    public User getSingleUserNotFound() {
        return gson.fromJson(get(URI_USER + "/" + NUMBER_NOT_FOUND, HTTP_NOT_FOUND).asString(), User.class);
    }

    public ListResource getResourceList() {
        return gson.fromJson(get(URI_RESOURCE, HTTP_OK).asString(), ListResource.class);
    }

    public Resource getSingleResource() {
        return gson.fromJson(get(URI_RESOURCE + "/" + USER_ID, HTTP_OK).asString(), Resource.class);
    }

    public Resource getSingleResourceNotFound() {
        return gson.fromJson(get(URI_RESOURCE + "/" + NUMBER_NOT_FOUND, HTTP_NOT_FOUND).asString(), Resource.class);
    }

    public void create(UpdatedUser updatedUser) {
        post(gson.toJson(updatedUser), URI_USER, HTTP_CREATED);
    }

    public void put(UpdatedUser updatedUser) {
        put(gson.toJson(updatedUser), URI_USER + "/" + USER_ID, HTTP_OK);
    }

    public void patch(UpdatedUser updatedUser) {
        patch(gson.toJson(updatedUser), URI_USER + "/" + USER_ID, HTTP_OK);
    }

    public void delete() {
        delete(URI_USER + "/" + USER_ID, HTTP_NO_CONTENT);
    }

    public void createRegisterSuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), URI_REGISTER, HTTP_OK);
    }

    public void createRegisterUnsuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), URI_REGISTER, HTTP_BAD_REQUEST);
    }

    public void createLoginSuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), URI_LOGIN, HTTP_OK);
    }

    public void createLoginUnsuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), URI_LOGIN, HTTP_BAD_REQUEST);
    }

    public ListUsers getDelayedResponse() {
        return gson.fromJson(get(URI_USER + "?delay=3", HTTP_OK).asString(), ListUsers.class);
    }
}
