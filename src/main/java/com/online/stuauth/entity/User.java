package com.online.stuauth.entity;

public class User {
    private String name;
    private String password;
    private String jdId;
    private String identity;
    private String country;
    private String school;
    private String attendDate;
    private String diploma;
    private String studentNumber;
    private int authenticated;
    private String leaveDate;
    private String phone;
    private String welfared;
    private String other;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getWelfared() {

        return welfared;
    }

    public void setWelfared(String welfared) {
        this.welfared = welfared;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAuthenticated() {

        return authenticated;
    }

    public void setAuthenticated(int authenticated) {
        this.authenticated = authenticated;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }


    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getDiploma() {

        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getAttendDate() {

        return attendDate;
    }

    public void setAttendDate(String attendDate) {
        this.attendDate = attendDate;
    }

    public String getSchool() {

        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getJdId() {
        return jdId;
    }

    public void setJdId(String jdId) {
        this.jdId = jdId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
