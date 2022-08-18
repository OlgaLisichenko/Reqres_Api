package tests;

import dto.RegisterLogin;
import org.testng.annotations.Test;

public class ReqresApiLoginTest extends BaseApiTest {

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
}
