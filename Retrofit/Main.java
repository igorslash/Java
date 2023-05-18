package Retrofit;


import retrofit2.Response;
import java.io.IOException;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ApiService service = ApiService.getInstance();
        JsonPlaceHolder jsonPlaceHolder = service.getPlaceHolderAPI();
        Response<List<User>> users = jsonPlaceHolder.getUsers().execute();
        Response<List<Post>> post = jsonPlaceHolder.getPosts().execute();
        assert users.body() != null;
        users.body().forEach(System.out::println);
        assert post.body() != null;
        post.body().forEach(System.out::println);

    }
}
