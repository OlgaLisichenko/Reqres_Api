package tests;

import Api.ReqresApi;
import org.testng.annotations.BeforeMethod;

public class BaseApiTest {
    public ReqresApi reqresApi;

    @BeforeMethod
    public void setup() {
        reqresApi = new ReqresApi();
    }
}
