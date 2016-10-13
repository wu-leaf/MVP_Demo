package com.each.www.mvp_demo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.each.www.mvp_demo.R;
import com.each.www.mvp_demo.presenter.UserPresenter;

public class UserActivity extends AppCompatActivity implements View.OnClickListener,
        IUserView {

    private EditText mFirstNameEditText, mLastNameEditText, mIdEditText;
    private Button mSaveButton, mLoadButton;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        findWidgets();
        mUserPresenter = new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.saveButton:
                mUserPresenter.saveUser(getID(), getFristName(),
                        getLastName());
                break;
            case R.id.loadButton:
                mUserPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public void setFirstName(String firstName) {
        // TODO Auto-generated method stub
        mFirstNameEditText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        // TODO Auto-generated method stub
        mLastNameEditText.setText(lastName);
    }

    @Override
    public int getID() {
        // TODO Auto-generated method stub
        return Integer.parseInt(mIdEditText.getText().toString());
    }

    @Override
    public String getFristName() {
        // TODO Auto-generated method stub
        return mFirstNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return mLastNameEditText.getText().toString();
    }

    void findWidgets() {
        mFirstNameEditText = (EditText) findViewById(R.id.first_name_edt);
        mLastNameEditText = (EditText) findViewById(R.id.last_name_edt);
        mIdEditText = (EditText) findViewById(R.id.id_edt);

        mSaveButton = (Button) findViewById(R.id.saveButton);
        mLoadButton = (Button) findViewById(R.id.loadButton);
    }
}

