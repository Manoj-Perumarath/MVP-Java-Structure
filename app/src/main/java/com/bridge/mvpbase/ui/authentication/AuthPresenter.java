package com.bridge.mvpbase.ui.authentication;

public interface AuthPresenter {

    void setView(AuthView loginView);

    void loadSignUpFragment();
}
