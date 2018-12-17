package com.bridge.mvpbase.ui.authentication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bridge.mvpbase.R;
import com.bridge.mvpbase.ui.authentication.login.LoginFragment;

import butterknife.ButterKnife;

public class AuthActivity extends AppCompatActivity implements AuthView {

    AuthPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        loginPresenter = new AuthPresenterImpl();
        loginPresenter.setView(this);
        loginPresenter.loadSignUpFragment();
    }


    @Override
    public void displayLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showSignSignUpFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.fl_auth_container, new LoginFragment()).commit();
    }
}
