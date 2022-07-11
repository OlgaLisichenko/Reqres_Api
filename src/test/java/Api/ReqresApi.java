package Api;

import com.google.gson.Gson;
import dto.*;

public class ReqresApi extends BaseApi {

    Gson gson = new Gson();

    public ListUsers getUsersList() {
        return gson.fromJson(get(reader.getUsersListUri()), ListUsers.class);
    }

    public User getSingleUser() {
        return gson.fromJson(get(reader.getSingleUserUri()), User.class);
    }

    public User getSingleUserNotFound() {
        return gson.fromJson(getWithStatus404(reader.getSingleUserNotFoundUri()), User.class);
    }

    public ListResource getResourceList() {
        return gson.fromJson(get(reader.getResourceListUri()), ListResource.class);
    }

    public Resource getSingleResource() {
        return gson.fromJson(get(reader.getSingleResourceUri()), Resource.class);
    }

    public Resource getSingleResourceNotFound() {
        return gson.fromJson(getWithStatus404(reader.getSingleResourceNotFoundUri()), Resource.class);
    }

    public void create(CreatedUser createdUser) {
        postWithStatus201(gson.toJson(createdUser), reader.getCreateUri());
    }

    public void put(CreatedUser createdUser) {
        put(gson.toJson(createdUser), reader.getPutUpdateUri());
    }

    public void patch(CreatedUser createdUser) {
        patch(gson.toJson(createdUser), reader.getPatchUpdateUri());
    }

    public void delete() {
        delete(reader.getDeleteUri());
    }

    public void createRegisterSuccessful(RegisterLogin registerLogin) {
        postWithStatus200(gson.toJson(registerLogin), reader.getRegisterSuccessfulUri());
    }

    public void createRegisterUnsuccessful(RegisterLogin registerLogin) {
        postWithStatus400(gson.toJson(registerLogin), reader.getRegisterUnsuccessfulUri());
    }

    public void createLoginSuccessful(RegisterLogin registerLogin) {
        postWithStatus200(gson.toJson(registerLogin), reader.getLoginSuccessfulUri());
    }

    public void createLoginUnsuccessful(RegisterLogin registerLogin) {
        postWithStatus400(gson.toJson(registerLogin), reader.getLoginUnsuccessfulUri());
    }

    public ListUsers getDelayedResponse() {
        return gson.fromJson(get(reader.getDelayedResponseUri()), ListUsers.class);
    }
}
