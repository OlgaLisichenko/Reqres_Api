package dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class User {
    @SerializedName("data")
    UserData userData;
    Support support;
}
