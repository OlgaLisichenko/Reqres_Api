package tests;

import dto.RegisterLogin;
import org.testng.annotations.Test;

public class ReqresApiRegisterTest extends BaseApiTest {

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
}
