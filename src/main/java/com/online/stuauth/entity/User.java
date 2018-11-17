package com.online.stuauth.entity;

public class User {
    private String name;
    private String password;
    private String jd_Id;
    private String identity;
    private String country;
    private String school;
    private String attend_Date;
    private String diploma;
    private String student_Number;
    private int authenticated;
    private String leave_date;
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

    public String getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(String leave_date) {
        this.leave_date = leave_date;
    }


    public String getStudent_Number() {
        return student_Number;
    }

    public void setStudent_Number(String student_Number) {
        this.student_Number = student_Number;
    }

    public String getDiploma() {

        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getAttend_Date() {

        return attend_Date;
    }

    public void setAttend_Date(String attend_Date) {
        this.attend_Date = attend_Date;
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

    public String getJd_Id() {
        return jd_Id;
    }

    public void setJd_Id(String jd_Id) {
        this.jd_Id = jd_Id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
