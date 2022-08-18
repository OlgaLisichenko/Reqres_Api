package tests;

import dto.ListResource;
import dto.Resource;
import org.testng.annotations.Test;

public class ReqresApiResourceTest extends BaseApiTest {

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
}
