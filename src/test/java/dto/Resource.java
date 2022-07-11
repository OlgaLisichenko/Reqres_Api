package dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Resource {
    @SerializedName("data")
    ResourceData resourceData;
    Support support;
}
