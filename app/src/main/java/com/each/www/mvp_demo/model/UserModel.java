package com.each.www.mvp_demo.model;


import com.each.www.mvp_demo.entity.UserBean;

/**
 * Created by Veyron on 2016/10/13.
 * Function：
 *         负责数据的存储、检索、操作
 *        常实现一个 Model interface 来减低耦合
 */
public class UserModel implements IUserModel{

    @Override
    public void setID(int id) {

    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public void setLastName(String lastName) {

    }

    @Override
    public UserBean load(int id) {
        return null;
    }
}
