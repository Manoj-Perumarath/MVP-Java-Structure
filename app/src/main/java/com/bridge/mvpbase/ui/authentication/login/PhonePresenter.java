package com.bridge.mvpbase.ui.authentication.login;

public interface PhonePresenter {

    void setView(PhoneView phoneView);

    void loginUsingPhone(String phoneNumber);
}
