package com.apollo.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class RegistrationResponse {

    @SerializedName("message")
    public String message;
    @SerializedName("success")
    public boolean success;
    @SerializedName("data")
    public Data data;
    @SerializedName("zcServerDateTime")
    public String zcServerDateTime;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getZcServerDateTime() {
        return zcServerDateTime;
    }

    public void setZcServerDateTime(String zcServerDateTime) {
        this.zcServerDateTime = zcServerDateTime;
    }

    public class Data {
        @SerializedName("uid")
        public String uid;
        @SerializedName("success")
        public boolean success;
        @SerializedName("message")
        public String message;
        @SerializedName("isUpdate")
        public boolean isUpdate;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean isUpdate() {
            return isUpdate;
        }

        public void setUpdate(boolean update) {
            isUpdate = update;
        }
    }

}

