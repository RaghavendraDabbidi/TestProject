package com.teka.myapplication.registration;

import com.google.gson.annotations.SerializedName;

public class RegionRequest {
    @SerializedName("dependents")
    public Dependents dependents;

    public Dependents getDependents() {
        return dependents;
    }

    public void setDependents(Dependents dependents) {
        this.dependents = dependents;
    }

    public class Dependents {
      @SerializedName("state")
      public State state;
      @SerializedName("city")
        public String city;

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
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
    public class City{
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
