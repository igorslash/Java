package Retrofit;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@ToString
@EqualsAndHashCode
public class User {
    private String id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
}
