package com.each.www.mvp_demo.presenter;

import com.each.www.mvp_demo.entity.UserBean;

import com.each.www.mvp_demo.model.IUserModel;
import com.each.www.mvp_demo.model.UserModel;
import com.each.www.mvp_demo.view.IUserView;

/**
 * Created by Veyron on 2016/10/13.
 * Function：Presenter
 */
public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName());
        mUserView.setLastName(user.getLastName());
    }
}
