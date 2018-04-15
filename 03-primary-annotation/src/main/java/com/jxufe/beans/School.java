package com.jxufe.beans;

/**
 * Created by Zhuang on 2018/4/15.
 */
public class School {
    private String sname;
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "sname='" + sname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
