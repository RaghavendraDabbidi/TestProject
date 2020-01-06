package com.teka.myapplication.login;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.teka.myapplication.R;
import com.teka.myapplication.api.ApiClient;
import com.teka.myapplication.api.ApiInterface;
import com.teka.myapplication.databinding.ActivityLoginBinding;
import com.teka.myapplication.databinding.ActivityLoginScreenBinding;
import com.teka.myapplication.dto.LoginRequest;
import com.teka.myapplication.dto.LoginResponse;
import com.teka.myapplication.listeners_login.CallBack;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements CallBack {
    private LoginModel loginModel;
    private ApiInterface apiInterface;
    private ApiClient apiClient;
    private ActivityLoginBinding loginBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //used to hide the action bar at top
        getSupportActionBar().hide();
//        setContentView(R.layout.activity_login);
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginBinding.setHandlers(this);
//        loginModel = new LoginModel("","");
//        binding.setLogin(loginModel);
    }

    @Override
    public void onSubmitClick() {
        call();
    }

    @Override
    public void onForgotPasswordClick() {

    }

    @Override
    public void onNewMemberClick() {

    }

    public void call() {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        LoginRequest request = new LoginRequest(loginBinding.phoneNum.getText().toString(), loginBinding.password.getText().toString());
        Call<LoginResponse> call = apiInterface.doPostListLoginResponse(request);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Log.e("TAG", response.code() + "");
            }
            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                call.cancel();
            }
        });
    }
}