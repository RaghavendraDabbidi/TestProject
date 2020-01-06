package com.teka.myapplication.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LoginResponse {

    @SerializedName("data")
    private Data data;
    @SerializedName("success")
    private boolean success;
    @SerializedName("zcServerDateTime")
    private String zcServerDateTime;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getZcServerDateTime() {
        return zcServerDateTime;
    }

    public void setZcServerDateTime(String zcServerDateTime) {
        this.zcServerDateTime = zcServerDateTime;
    }

    public class Data {
        @SerializedName("name")
        public String name;
        @SerializedName("preference")
        private Preference preference;
        @SerializedName("login_attempts")
        private int login_attempts;
        @SerializedName("is_locked")
        public boolean is_locked;
        @SerializedName("email")
        public String email;
        @SerializedName("mobileAccess")
        public boolean mobileAccess;
        @SerializedName("userCode")
        public String userCode;
        @SerializedName("loginId")
        public String loginId;
        @SerializedName("phone")
        public Phone phone;
        @SerializedName("gender")
        public Gender gender;
        @SerializedName("contact")
        public String contact;
        @SerializedName("role")
        public Role role;
        @SerializedName("userType")
        public UserType userType;
        @SerializedName("lastLoggedIn")
        public LastLoggedIn lastLoggedIn;
        @SerializedName("reportsTo")
        public ReportsTo reportsTo;
        @SerializedName("image")
        public String image;
        @SerializedName("country")
        public Country country;
        @SerializedName("currency")
        public Currency currency;
        @SerializedName("timeZone")
        public TimeZone timeZone;
        @SerializedName("last_accessed_on")
        public int last_accessed_on;
        @SerializedName("token")
        public String token;
        @SerializedName("addInfo")
        public AddInfo addInfo;
        @SerializedName("cacheKey")
        public String cacheKey;
        @SerializedName("expiry")
        public int expiry;
        @SerializedName("userGroups")
        public ArrayList<Object> userGroups;
        @SerializedName("app")
        public String app;
        @SerializedName("redirectUrl")
        public String redirectUrl;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Preference getPreference() {
            return preference;
        }

        public void setPreference(Preference preference) {
            this.preference = preference;
        }

        public int getLogin_attempts() {
            return login_attempts;
        }

        public void setLogin_attempts(int login_attempts) {
            this.login_attempts = login_attempts;
        }

        public boolean isIs_locked() {
            return is_locked;
        }

        public void setIs_locked(boolean is_locked) {
            this.is_locked = is_locked;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public boolean isMobileAccess() {
            return mobileAccess;
        }

        public void setMobileAccess(boolean mobileAccess) {
            this.mobileAccess = mobileAccess;
        }

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }

        public String getLoginId() {
            return loginId;
        }

        public void setLoginId(String loginId) {
            this.loginId = loginId;
        }

        public Phone getPhone() {
            return phone;
        }

        public void setPhone(Phone phone) {
            this.phone = phone;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public Role getRole() {
            return role;
        }

        public void setRole(Role role) {
            this.role = role;
        }

        public UserType getUserType() {
            return userType;
        }

        public void setUserType(UserType userType) {
            this.userType = userType;
        }

        public LastLoggedIn getLastLoggedIn() {
            return lastLoggedIn;
        }

        public void setLastLoggedIn(LastLoggedIn lastLoggedIn) {
            this.lastLoggedIn = lastLoggedIn;
        }

        public ReportsTo getReportsTo() {
            return reportsTo;
        }

        public void setReportsTo(ReportsTo reportsTo) {
            this.reportsTo = reportsTo;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public TimeZone getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }

        public int getLast_accessed_on() {
            return last_accessed_on;
        }

        public void setLast_accessed_on(int last_accessed_on) {
            this.last_accessed_on = last_accessed_on;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public AddInfo getAddInfo() {
            return addInfo;
        }

        public void setAddInfo(AddInfo addInfo) {
            this.addInfo = addInfo;
        }

        public String getCacheKey() {
            return cacheKey;
        }

        public void setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
        }

        public int getExpiry() {
            return expiry;
        }

        public void setExpiry(int expiry) {
            this.expiry = expiry;
        }

        public ArrayList<Object> getUserGroups() {
            return userGroups;
        }

        public void setUserGroups(ArrayList<Object> userGroups) {
            this.userGroups = userGroups;
        }

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public String getRedirectUrl() {
            return redirectUrl;
        }

        public void setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
        }
    }


    public class Preference {
        @SerializedName("theme")
        public String theme;
        @SerializedName("lang")
        public String lang;
        @SerializedName("timeZone")
        public String timeZone;

        public String getTheme() {
            return theme;
        }

        public void setTheme(String theme) {
            this.theme = theme;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(String timeZone) {
            this.timeZone = timeZone;
        }
    }

    public class Phone {
        @SerializedName("code")
        public String code;
        @SerializedName("isdCode")
        public String isdCode;
        @SerializedName("value")
        public String value;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getIsdCode() {
            return isdCode;
        }

        public void setIsdCode(String isdCode) {
            this.isdCode = isdCode;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public class Gender {
        @SerializedName("value")
        public String value;
        @SerializedName("label")
        public String label;
        @SerializedName("icon")
        public String icon;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public class Role {
        @SerializedName("value")
        public String value;
        @SerializedName("label")
        public String label;
        @SerializedName("icon")
        public String icon;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public class UserType {
        @SerializedName("value")
        public String value;
        @SerializedName("label")
        public String label;
        @SerializedName("icon")
        public String icon;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public class LastLoggedIn {
        @SerializedName("device")
        public String device;
        @SerializedName("agent")
        public String agent;
        @SerializedName("ip")
        public String ip;
        @SerializedName("time")
        public String time;

        public String getDevice() {
            return device;
        }

        public void setDevice(String device) {
            this.device = device;
        }

        public String getAgent() {
            return agent;
        }

        public void setAgent(String agent) {
            this.agent = agent;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public class ReportsTo {
        @SerializedName("name")
        public String name;
        @SerializedName("code")
        public String code;
        @SerializedName("email")
        public String email;
        @SerializedName("contact")
        public String contact;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }
    }

    public class Country {
        @SerializedName("value")
        public String value;
        @SerializedName("label")
        public String label;
        @SerializedName("icon")
        public String icon;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public class Currency {
        @SerializedName("value")
        public String value;
        @SerializedName("label")
        public String label;
        @SerializedName("icon")
        public String icon;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public class TimeZone {
        @SerializedName("value")
        public String value;
        @SerializedName("label")
        public String label;
        @SerializedName("icon")
        public String icon;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
    public class AddInfo {

    }
}







