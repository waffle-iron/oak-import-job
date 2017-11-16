package com.project.model;

public class UserRegister {

    private String firstName;
    private String lastName;
    private String userEmail;
    private String pass;
    private String phone;
    private String zipcode;
    private boolean isAlertActive;
    private String deviceId;
    private String deviceToken;
    private String platform;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isAlertActive() {
        return isAlertActive;
    }

    public void setAlertActive(boolean isAlertActive) {
        this.isAlertActive = isAlertActive;
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

    public UserRegister(String firstName, String lastName, String userEmail, String pass, String phone, String zipcode, boolean isAlertActive, String deviceId, String deviceToken, String platform) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.pass = pass;
        this.phone = phone;
        this.zipcode = zipcode;
        this.isAlertActive = isAlertActive;
        this.deviceId = deviceId;
        this.deviceToken = deviceToken;
        this.platform = platform;
    }

    public UserRegister() {
        super();
    }

}
