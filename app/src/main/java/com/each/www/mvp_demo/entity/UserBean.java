package com.each.www.mvp_demo.entity;

/**
 * Created by Veyron on 2016/10/13.
 * Function：用户实体
 */
public class UserBean {
    private String mFirstName;
    private String mLastName;

    public UserBean(String firstName, String lastName) {

        this.mFirstName = firstName;
        this.mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }
}
