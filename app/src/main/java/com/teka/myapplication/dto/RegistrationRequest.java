package com.teka.myapplication.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RegistrationRequest {

    @SerializedName("delivery_executive")
    public DeliveryExecutive deliveryExecutive;
    @SerializedName("user_banking_details")
    public UserBankingDetails userBankingDetails;
    @SerializedName("email")
    public String email;
    @SerializedName("first_name")
    public String firstName;
    @SerializedName("last_name")
    public String LastNmae;
    @SerializedName("password")
    public String password;
    @SerializedName("contact_cc")
    public Contact_cc contact_cc;
    @SerializedName("contact_no")
    public String contactNo;
    @SerializedName("referral_code")
    public String refferalCode;
    @SerializedName("state")
    public State state;
    @SerializedName("city")
    public City city;
    @SerializedName("region")
    public Region region;



    public DeliveryExecutive getDeliveryExecutive() {
        return deliveryExecutive;
    }

    public void setDeliveryExecutive(DeliveryExecutive deliveryExecutive) {
        this.deliveryExecutive = deliveryExecutive;
    }

    public UserBankingDetails getUserBankingDetails() {
        return userBankingDetails;
    }

    public void setUserBankingDetails(UserBankingDetails userBankingDetails) {
        this.userBankingDetails = userBankingDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNmae() {
        return LastNmae;
    }

    public void setLastNmae(String lastNmae) {
        LastNmae = lastNmae;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact_cc getContact_cc() {
        return contact_cc;
    }

    public void setContact_cc(Contact_cc contact_cc) {
        this.contact_cc = contact_cc;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getRefferalCode() {
        return refferalCode;
    }

    public void setRefferalCode(String refferalCode) {
        this.refferalCode = refferalCode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public static class DeliveryExecutive{
        @SerializedName("pan_no")
        public  String panNo;
        @SerializedName("aadhar_no")
        public String aadharNo;
        @SerializedName("aadhar_pic")
        public ArrayList<Object>aadharPic;
        @SerializedName("driving_license_pic")
        public ArrayList<Object>drivingLicensePic;
        @SerializedName("pan_pic")
        public ArrayList<Object>panPic;
        @SerializedName("photo")
        public ArrayList<Object>photo;
        @SerializedName("driving_license_no")
        public  String drivingLicenseNo;

        public String getPanNo() {
            return panNo;
        }

        public void setPanNo(String panNo) {
            this.panNo = panNo;
        }

        public String getAadharNo() {
            return aadharNo;
        }

        public void setAadharNo(String aadharNo) {
            this.aadharNo = aadharNo;
        }

        public ArrayList<Object> getAadharPic() {
            return aadharPic;
        }

        public void setAadharPic(ArrayList<Object> aadharPic) {
            this.aadharPic = aadharPic;
        }

        public ArrayList<Object> getDrivingLicensePic() {
            return drivingLicensePic;
        }

        public void setDrivingLicensePic(ArrayList<Object> drivingLicensePic) {
            this.drivingLicensePic = drivingLicensePic;
        }

        public ArrayList<Object> getPanPic() {
            return panPic;
        }

        public void setPanPic(ArrayList<Object> panPic) {
            this.panPic = panPic;
        }

        public ArrayList<Object> getPhoto() {
            return photo;
        }

        public void setPhoto(ArrayList<Object> photo) {
            this.photo = photo;
        }

        public String getDrivingLicenseNo() {
            return drivingLicenseNo;
        }

        public void setDrivingLicenseNo(String drivingLicenseNo) {
            this.drivingLicenseNo = drivingLicenseNo;
        }
    }
       public class UserBankingDetails{

           @SerializedName("account_no")
           public  String accountNo;
           @SerializedName("bank_name")
           public String bankName;
           @SerializedName("branch")
           public String branch;
           @SerializedName("ifsc_code")
           public String ifsc_code;
           @SerializedName("name_as_on_pass")
           public String name_as_on_pass;

           public String getAccountNo() {
               return accountNo;
           }

           public void setAccountNo(String accountNo) {
               this.accountNo = accountNo;
           }

           public String getBankName() {
               return bankName;
           }

           public void setBankName(String bankName) {
               this.bankName = bankName;
           }

           public String getBranch() {
               return branch;
           }

           public void setBranch(String branch) {
               this.branch = branch;
           }

           public String getIfsc_code() {
               return ifsc_code;
           }

           public void setIfsc_code(String ifsc_code) {
               this.ifsc_code = ifsc_code;
           }

           public String getName_as_on_pass() {
               return name_as_on_pass;
           }

           public void setName_as_on_pass(String name_as_on_pass) {
               this.name_as_on_pass = name_as_on_pass;
           }
       }

    public class Contact_cc{
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

    public class State {
        @SerializedName("uid")
        public String uid;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }

    public class City {
        @SerializedName("uid")
        public String uid;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }

    public class Region {
        @SerializedName("uid")
        public String uid;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }

}
