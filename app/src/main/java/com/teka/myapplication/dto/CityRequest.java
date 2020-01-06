package com.teka.myapplication.dto;

import com.google.gson.annotations.SerializedName;

public class CityRequest {
    @SerializedName("dependents")
    public Dependents dependents;

    public Dependents getDependents() {
        return dependents;
    }

    public void setDependents(Dependents dependents) {
        this.dependents = dependents;
    }

    public class Dependents{
        @SerializedName("state")
        public State state;

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }
    }

    public class State{
        @SerializedName("uid")
        public String uid;
        @SerializedName("name")
        public String name;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
