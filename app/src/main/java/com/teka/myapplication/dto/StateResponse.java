package com.teka.myapplication.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class StateResponse {
    @SerializedName("message")
    public String message;
    @SerializedName("success")
    public String success;
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

    public class Data{
        @SerializedName("listData")
        public ListData liistData;

        public ListData getLiistData() {
            return liistData;
        }

        public void setLiistData(ListData liistData) {
            this.liistData = liistData;
        }

        public class ListData{
            @SerializedName("records")
            public String records;
            @SerializedName("select")
            public boolean select;
            @SerializedName("total")
            public int total;
            @SerializedName("page")
            public int page;
            @SerializedName("rows")
            public ArrayList<Rows>rows;
            @SerializedName("zc_extra")
            public String zcExtra;
            @SerializedName("pivotData")
            public String pivotData;
            @SerializedName("aggregation")
            public String aggregation;
            @SerializedName("size")
            public int size;

            public String getRecords() {
                return records;
            }

            public void setRecords(String records) {
                this.records = records;
            }

            public boolean isSelect() {
                return select;
            }

            public void setSelect(boolean select) {
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

            public String getZcExtra() {
                return zcExtra;
            }

            public void setZcExtra(String zcExtra) {
                this.zcExtra = zcExtra;
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

            public class Rows{
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

    }
}
