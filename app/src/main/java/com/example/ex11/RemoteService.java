package com.example.ex11;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RemoteService {
    public static final String BASE_URL="http://192.168.0.173:3000";

    @GET("/users")
    Call<List<UserVO>> list();

    @POST("/users/insert")
    Call<Void> insert(@Body() UserVO vo);
}
