package com.teka.myapplication;

import com.teka.myapplication.dto.CityRequest;
import com.teka.myapplication.dto.CityResponce;
import com.teka.myapplication.dto.StateRequest;
import com.teka.myapplication.dto.StateResponse;
import com.teka.myapplication.dto.RegistrationRequest;
import com.teka.myapplication.dto.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterface {
    @POST("api/teka/registration/registration/registration")
    Call<RegistrationResponse> doPostListResource(@Body RegistrationRequest registrationRequest);

    @POST("api/teka/master/state/state-list")
    Call<StateResponse> doPostListState(@Body StateRequest stateRequest);

    @POST("api/teka/master/city/city-list")
    Call<CityResponce> doPostListCity(@Body CityRequest cityRequest);


    @POST("api/teka/master/region/region-list")
    Call<RegistrationResponse> doPostListRegion(@Body RegistrationRequest registrationRequest);
}


//http://teka.zeroco.de/zc-v3-user-svc/2.0/teka/api/teka/master/region/region-list
//http://teka.zeroco.de/zc-v3-user-svc/2.0/teka/api/teka/master/city/city-list
//http://teka.zeroco.de/zc-v3-user-svc/2.0/teka/api/teka/master/state/state-list
