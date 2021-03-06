package com.hipasserby.request.editUsersInformation;

public class ContactInformationAboutUserRequest {

    private String email;

    private String phoneNumber;

    public ContactInformationAboutUserRequest() {
    }

    public ContactInformationAboutUserRequest(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactInformationAboutUserRequest{" +
                "email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
