package Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JsonPlaceHolder {
    @GET("users")
    Call<List<User>> getUsers();
    @GET("posts")
    Call<List<Post>> getPosts();
}
