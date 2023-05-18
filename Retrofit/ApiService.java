package Retrofit;

import lombok.Data;
import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
@Data
public class ApiService {
    private static ApiService mInstance;
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private final Retrofit retrofit;

    private ApiService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                //.addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ApiService getInstance() {
        if (mInstance == null) {
            mInstance = new ApiService();
        }
        return mInstance;
    }
    public JsonPlaceHolder getPlaceHolderAPI() {
        return retrofit.create(JsonPlaceHolder.class);
    }
}
