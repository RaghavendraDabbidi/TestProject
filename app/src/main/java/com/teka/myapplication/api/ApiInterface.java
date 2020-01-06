package com.teka.myapplication.api;

import com.teka.myapplication.dto.LoginRequest;
import com.teka.myapplication.dto.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("login")
    Call<LoginResponse> doPostListLoginResponse(@Body LoginRequest loginRequest);

//    @POST("login")
//    Observable<LoginResponse> LOGIN_CALL(@Body LoginRequest loginRequest);

}
