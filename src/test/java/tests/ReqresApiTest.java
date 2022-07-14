package tests;

import dto.*;
import org.testng.annotations.Test;

public class ReqresApiTest extends BaseApiTest {

    UpdatedUser updatedUser = UpdatedUser.
            builder().
            name("morpheus").
            job("zion resident").
            build();

    @Test
    public void getListUsers() {
        ListUsers listUsers = reqresApi.getUsersList();
        System.out.println(listUsers);
    }

    @Test
    public void getSingleUser() {
        User singleUser = reqresApi.getSingleUser();
        System.out.println(singleUser);
    }

    @Test
    public void getSingleUserNotFound() {
        User singleUserNotFound = reqresApi.getSingleUserNotFound();
        System.out.println(singleUserNotFound);
    }

    @Test
    public void getListResource() {
        ListResource listResource = reqresApi.getResourceList();
        System.out.println(listResource);
    }

    @Test
    public void getSingleResource() {
        Resource singleResource = reqresApi.getSingleResource();
        System.out.println(singleResource);
    }

    @Test
    public void getSingleResourceNotFound() {
        Resource singleResource = reqresApi.getSingleResourceNotFound();
        System.out.println(singleResource);
    }

    @Test
    public void postCreate() {
        reqresApi.create(updatedUser);
        System.out.println(updatedUser);
    }

    @Test
    public void putUpdate() {
        reqresApi.put(updatedUser);
        System.out.println(updatedUser);
    }

    @Test
    public void patchUpdate() {
        reqresApi.patch(updatedUser);
        System.out.println(updatedUser);
    }

    @Test
    public void delete() {
         reqresApi.delete();
    }

    @Test
    public void postRegisterSuccessful() {
        RegisterLogin register = RegisterLogin.
                builder().
                email("eve.holt@reqres.in").
                password("pistol").
                build();

        reqresApi.createRegisterSuccessful(register);
        System.out.println(register);
    }

    @Test
    public void postRegisterUnsuccessful() {
        RegisterLogin register = RegisterLogin.
                builder().
                email("sydney@fife").
                build();

        reqresApi.createRegisterUnsuccessful(register);
        System.out.println(register);
    }

    @Test
    public void postLoginSuccessful() {
        RegisterLogin login = RegisterLogin.
                builder().
                email("eve.holt@reqres.in").
                password("cityslicka").
                build();

        reqresApi.createLoginSuccessful(login);
        System.out.println(login);
    }

    @Test
    public void postLoginUnsuccessful() {
        RegisterLogin login = RegisterLogin.
                builder().
                email("peter@klaven").
                build();

        reqresApi.createLoginUnsuccessful(login);
        System.out.println(login);
    }

    @Test
    public void getDelayedResponse() {
        ListUsers listUsers = reqresApi.getDelayedResponse();
        System.out.println(listUsers);
    }
}
