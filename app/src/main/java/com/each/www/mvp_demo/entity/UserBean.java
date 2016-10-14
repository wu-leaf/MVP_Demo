package com.each.www.mvp_demo.entity;

/**
 * Created by Veyron on 2016/10/13.
 * Function：
 *         用户实体
 *         在MVP框架中属于一个中间量：属于Model层的概念
 *         只有Model层才对数据进行操作
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
