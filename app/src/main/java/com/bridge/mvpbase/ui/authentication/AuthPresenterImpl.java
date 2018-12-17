package com.bridge.mvpbase.ui.authentication;

public class AuthPresenterImpl implements AuthPresenter {

    private AuthView loginView;

    @Override
    public void setView(AuthView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void loadSignUpFragment() {
loginView.showSignSignUpFragment();
    }
}
