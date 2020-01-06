package com.teka.myapplication.registration;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RegionResponse {

    @SerializedName("message")
    public String message;
    @SerializedName("success")
    public String success;
    @SerializedName("data")
    public Data data;
    @SerializedName("zcServerDateTime")
    public String zcServerDateTime;

    public RegionResponse(String message, String success, Data data, String zcServerDateTime) {
        this.message = message;
        this.success = success;
        this.data = data;
        this.zcServerDateTime = zcServerDateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
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
        @SerializedName("listData")
        public ListData listData;

        public Data(ListData listData) {
            this.listData = listData;
        }

        public ListData getListData() {
            return listData;
        }

        public void setListData(ListData listData) {
            this.listData = listData;
        }
    }

    public class ListData {
        @SerializedName("records")
        public String records;
        @SerializedName("select")
        public String select;
        @SerializedName("total")
        public int total;
        @SerializedName("page")
        public int page;
        @SerializedName("rows")
        public ArrayList<Rows> rows;
        @SerializedName("zc_extra")
        public String zc_extra;
        @SerializedName("pivotData")
        public String pivotData;
        @SerializedName("aggregation")
        public String aggregation;
        @SerializedName("size")
        public int size;

        public ListData(String records, String select, int total, int page, ArrayList<Rows> rows,
                        String zc_extra, String pivotData, String aggregation, int size) {
            this.records = records;
            this.select = select;
            this.total = total;
            this.page = page;
            this.rows = rows;
            this.zc_extra = zc_extra;
            this.pivotData = pivotData;
            this.aggregation = aggregation;
            this.size = size;
        }

        public String getRecords() {
            return records;
        }

        public void setRecords(String records) {
            this.records = records;
        }

        public String getSelect() {
            return select;
        }

        public void setSelect(String select) {
            this.select = select;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public ArrayList<Rows> getRows() {
            return rows;
        }

        public void setRows(ArrayList<Rows> rows) {
            this.rows = rows;
        }

        public String getZc_extra() {
            return zc_extra;
        }

        public void setZc_extra(String zc_extra) {
            this.zc_extra = zc_extra;
        }

        public String getPivotData() {
            return pivotData;
        }

        public void setPivotData(String pivotData) {
            this.pivotData = pivotData;
        }

        public String getAggregation() {
            return aggregation;
        }

        public void setAggregation(String aggregation) {
            this.aggregation = aggregation;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

    public class Rows {
        @SerializedName("uid")
        public String uid;
        @SerializedName("address")
        public String address;
        @SerializedName("landmark")
        public String landmark;
        @SerializedName("latitude")
        public String latitude;
        @SerializedName("longitude")
        public String longitude;
        @SerializedName("city")
        public City city;
        @SerializedName("name")
        public String name;
        @SerializedName("state")
        public State state;

        public Rows(String uid, String address, String landmark, String latitude,
                    String longitude, City city, String name, State state) {
            this.uid = uid;
            this.address = address;
            this.landmark = landmark;
            this.latitude = latitude;
            this.longitude = longitude;
            this.city = city;
            this.name = name;
            this.state = state;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLandmark() {
            return landmark;
        }

        public void setLandmark(String landmark) {
            this.landmark = landmark;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }
    }

    public class City {
        @SerializedName("uid")
        public String uid;
        @SerializedName("name")
        public String name;

        public City(String uid, String name) {
            this.uid = uid;
            this.name = name;
        }

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
    public class State {
        @SerializedName("uid")
        public String uid;
        @SerializedName("name")
        public String name;

        public State(String uid, String name) {
            this.uid = uid;
            this.name = name;
        }

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
