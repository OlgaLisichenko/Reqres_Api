package tests;

import dto.ListUsers;
import dto.User;
import org.testng.annotations.Test;
import utils.TestConstants;

public class ReqresApiUserTest extends BaseApiTest implements TestConstants {

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
    public void postCreate() {
        reqresApi.create(UPDATED_USER);
        System.out.println(UPDATED_USER);
    }

    @Test
    public void putUpdate() {
        reqresApi.put(UPDATED_USER);
        System.out.println(UPDATED_USER);
    }

    @Test
    public void patchUpdate() {
        reqresApi.patch(UPDATED_USER);
        System.out.println(UPDATED_USER);
    }

    @Test
    public void delete() {
        reqresApi.delete();
    }

    @Test
    public void getDelayedResponse() {
        ListUsers listUsers = reqresApi.getDelayedResponse();
        System.out.println(listUsers);
    }
}
