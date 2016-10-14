package com.each.www.mvp_demo.model;

import com.each.www.mvp_demo.entity.UserBean;

/**
 * Created by Veyron on 2016/10/13.
 * Function：
 *          接口类，让 Model 层
 *          通过这个接口 与Presenter 进行交互
 */
public interface IUserModel {
    /*
    在Model层对三个字段进行写操作
     */
    void setID(int id);
    void setFirstName(String firstName);
    void setLastName(String lastName);

    /*
    在Model层根据ID读取数据：FirstName，LastName
    返回一个UserBean 对象实体
    */
    UserBean load(int id);
}
