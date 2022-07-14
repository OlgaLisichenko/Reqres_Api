package Api;

import com.google.gson.Gson;
import dto.*;

public class ReqresApi extends BaseApi {

    Gson gson = new Gson();

    int statusCodeOk = 200;
    int statusCodeCreated = 201;
    int statusCodeBadRequest = 400;
    int statusCodeNotFound = 404;

    int userId = 2;
    int numberNotFound = 23;

    String uriUser = "user";
    String uriResource = "unknown";
    String uriRegister = "register";
    String uriLogin = "login";

    public ListUsers getUsersList() {
        return gson.fromJson(get(uriUser + "?page=2", statusCodeOk).asString(), ListUsers.class);
    }

    public User getSingleUser() {
        return gson.fromJson(get(uriUser + "/" + userId, statusCodeOk).asString(), User.class);
    }

    public User getSingleUserNotFound() {
        return gson.fromJson(get(uriUser + "/" + numberNotFound, statusCodeNotFound).asString(), User.class);
    }

    public ListResource getResourceList() {
        return gson.fromJson(get(uriResource, statusCodeOk).asString(), ListResource.class);
    }

    public Resource getSingleResource() {
        return gson.fromJson(get(uriResource + "/" + userId, statusCodeOk).asString(), Resource.class);
    }

    public Resource getSingleResourceNotFound() {
        return gson.fromJson(get(uriResource + "/" + numberNotFound, statusCodeNotFound).asString(), Resource.class);
    }

    public void create(UpdatedUser updatedUser) {
        post(gson.toJson(updatedUser), uriUser, statusCodeCreated);
    }

    public void put(UpdatedUser updatedUser) {
        put(gson.toJson(updatedUser), uriUser + "/" + userId);
    }

    public void patch(UpdatedUser updatedUser) {
        patch(gson.toJson(updatedUser), uriUser + "/" + userId);
    }

    public void delete() {
        delete(uriUser + "/" + userId);
    }

    public void createRegisterSuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), uriRegister, statusCodeOk);
    }

    public void createRegisterUnsuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), uriRegister, statusCodeBadRequest);
    }

    public void createLoginSuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), uriLogin, statusCodeOk);
    }

    public void createLoginUnsuccessful(RegisterLogin registerLogin) {
        post(gson.toJson(registerLogin), uriLogin, statusCodeBadRequest);
    }

    public ListUsers getDelayedResponse() {
        return gson.fromJson(get(uriUser + "?delay=3", statusCodeOk).asString(), ListUsers.class);
    }
}
