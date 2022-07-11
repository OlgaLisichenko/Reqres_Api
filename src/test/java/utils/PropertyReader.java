package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private Properties properties;

    public PropertyReader() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public String getUsersListUri() {
        return properties.getProperty("usersList.uri");
    }

    public String getSingleUserUri() {
        return properties.getProperty("singleUser.uri");
    }

    public String getSingleUserNotFoundUri() {
        return properties.getProperty("singleUserNotFound.uri");
    }

    public String getResourceListUri() {
        return properties.getProperty("resourceList.uri");
    }

    public String getSingleResourceUri() {
        return properties.getProperty("singleResource.uri");
    }

    public String getSingleResourceNotFoundUri() {
        return properties.getProperty("singleResourceNotFound.uri");
    }

    public String getCreateUri() {
        return properties.getProperty("create.uri");
    }

    public String getPutUpdateUri() {
        return properties.getProperty("putUpdate.uri");
    }

    public String getPatchUpdateUri() {
        return properties.getProperty("patchUpdate.uri");
    }

    public String getDeleteUri() {
        return properties.getProperty("delete.uri");
    }

    public String getRegisterSuccessfulUri() {
        return properties.getProperty("registerSuccessful.uri");
    }

    public String getRegisterUnsuccessfulUri() {
        return properties.getProperty("registerUnsuccessful.uri");
    }

    public String getLoginSuccessfulUri() {
        return properties.getProperty("loginSuccessful.uri");
    }

    public String getLoginUnsuccessfulUri() {
        return properties.getProperty("loginUnsuccessful.uri");
    }

    public String getDelayedResponseUri() {
        return properties.getProperty("delayedResponse.uri");
    }
}