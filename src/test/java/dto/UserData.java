package dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class UserData {
    int id;
    String email;
    @SerializedName("first_name")
    String firstName;
    @SerializedName("last_name")
    String lastname;
    String avatar;
}
