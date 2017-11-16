package com.project.model;

public class UserLogin {

    private String userEmail;
    private String pass;
    private String deviceId;
    private String deviceToken;
    private String platform;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public UserLogin(String userEmail, String pass, String deviceId, String deviceToken, String platform) {
        super();
        this.userEmail = userEmail;
        this.pass = pass;
        this.deviceId = deviceId;
        this.deviceToken = deviceToken;
        this.platform = platform;
    }

    public UserLogin() {
        super();
    }

}
// public class mobile_users {
//
// @SerializedName("date")
// @Expose
// private String date;
//
// @SerializedName("email_id")
// @Expose
// private String email_id;
//
// @SerializedName("password")
// @Expose
// private String password;
//
// @SerializedName("device_id")
// @Expose
// private String device_id;
//
// @SerializedName("device_token")
// @Expose
// private String device_token;
//
// @SerializedName("platform")
// @Expose
// private String platform;
//
// @SerializedName("first_name")
// @Expose
// private String first_name;
//
// @SerializedName("phone_no")
// @Expose
// private String phone_no;
//
// @SerializedName("zipcode")
// @Expose
// private String zipcode;
//
// @SerializedName("is_alert_active")
// @Expose
// private boolean is_alert_active;