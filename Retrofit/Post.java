package Retrofit;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@ToString
@EqualsAndHashCode
public class Post {
    String userId;
    String id;
    String title;
    String body;

}
