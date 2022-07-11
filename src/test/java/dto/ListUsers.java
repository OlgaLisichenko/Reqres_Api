package dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ListUsers {
    int page;
    @SerializedName("per_page")
    int perPage;
    int total;
    @SerializedName("total_pages")
    int totalPages;
    @SerializedName("data")
    ArrayList<UserData> userData;
    Support support;
}
