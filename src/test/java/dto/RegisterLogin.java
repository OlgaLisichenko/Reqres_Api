package dto;

import com.google.gson.annotations.Expose;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterLogin {
    @Expose
    String email;
    @Expose
    String password;
}
