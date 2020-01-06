package com.teka.myapplication.dto;

import com.google.gson.annotations.SerializedName;

public class LoginRequest {

    @SerializedName("appUserName")
    public String appUserName;

    @SerializedName("appPassword")
    public String appPassword;

    public LoginRequest(String appUserName, String appPassword) {
        this.appUserName = appUserName;
        this.appPassword = appPassword;
    }

    public String getAppUserName() {
        return appUserName;
    }

    public void setAppUserName(String appUserName) {
        this.appUserName = appUserName;
    }

    public String getAppPassword() {
        return appPassword;
    }

    public void setAppPassword(String appPassword) {
        this.appPassword = appPassword;
    }
}