package com.each.www.mvp_demo.model;

import com.each.www.mvp_demo.entity.UserBean;

/**
 * Created by Veyron on 2016/10/13.
 * Function：
 */
public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    UserBean load(int id);
}
