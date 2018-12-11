package com.bridge.mvpbase.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bridge.mvpbase.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginPresenter = new LoginPresenterImpl();
        loginPresenter.setView(this);
    }

    @Override
    public void displayLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
