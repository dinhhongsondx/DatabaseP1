package com.example.trangnho.databasep1.model;

/**
 * Created by Trang Nho on 02/05/2017.
 */

public class Student {
    private int id;
    private String mName;
    private String mAddress;
    private String mNumber;
    private String mEmail;

    public Student(String mName, String mAddress, String mNumber, String mEmail) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mNumber = mNumber;
        this.mEmail = mEmail;
    }

    public Student(int id, String mName, String mAddress, String mNumber, String mEmail) {
        this.id = id;
        this.mName = mName;
        this.mAddress = mAddress;
        this.mNumber = mNumber;
        this.mEmail = mEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}
