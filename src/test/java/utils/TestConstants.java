package utils;

import dto.UpdatedUser;

public interface TestConstants {

    int USER_ID = 2;
    int NUMBER_NOT_FOUND = 23;
    String URI_USER = "user";
    String URI_RESOURCE = "unknown";
    String URI_REGISTER = "register";
    String URI_LOGIN = "login";

    UpdatedUser UPDATED_USER = UpdatedUser.
            builder().
            name("morpheus").
            job("zion resident").
            build();
}