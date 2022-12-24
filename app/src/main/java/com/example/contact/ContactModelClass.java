package com.example.contact;

public class ContactModelClass {
    String name, mobileNo, email;
    int profileImage;

    public ContactModelClass(String name, String mobileNo, String email, int profileImage) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
        this.profileImage = profileImage;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }
    //getter
    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
