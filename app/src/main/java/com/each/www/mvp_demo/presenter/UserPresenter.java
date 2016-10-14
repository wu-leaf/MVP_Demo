package com.each.www.mvp_demo.presenter;

import com.each.www.mvp_demo.entity.UserBean;

import com.each.www.mvp_demo.model.IUserModel;
import com.each.www.mvp_demo.model.UserModel;
import com.each.www.mvp_demo.view.IUserView;

/**
 * Created by Veyron on 2016/10/13.
 * Function：
 *          作为 View 层 与 Model 层 交互的中间媒介（纽带）
 *          负责处理用户交互的复杂逻辑
 */
public class UserPresenter {
    private IUserView mUserView;   //视图View层的接口实例
    private IUserModel mUserModel; //模型Model层的接口实例

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    /*
    保存view层看到的数据的处理逻辑放在Presenter 里面实现
    但实际是调用模型Model的接口，把操作交付给Model层去处理实现。
    */
    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    /**
     * 在Presenter中调用Model处理完数据后
     * 通过IUserView更新View显示的信息
     * @param id
     */
    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName());
        mUserView.setLastName(user.getLastName());
    }
}
