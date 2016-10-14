package com.each.www.mvp_demo.view;

/**
 * Created by Veyron on 2016/10/13.
 * Function：
 *          接口类，让视图（Activity）-view
 *          通过这个接口与 Presenter进行交互
 */
public interface IUserView {
    /*
     View层，对ID,FirstName,LastName
     这三个EditText进行读操作
    */
    int getID();
    String getFristName();
    String getLastName();
    /*
      对FirstName,LastName
      进行写操作(根据ID,获得FirstName,LastName，并显示出来)
     */
    void setFirstName(String firstName);
    void setLastName(String lastName);
}
