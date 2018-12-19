package com.bridge.mvpbase.ui.authentication.login;

import com.bridge.mvpbase.constants.AppConstants;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class PhonePresenterImpl implements PhonePresenter {
    private PhoneView view;

    @Override
    public void setView(PhoneView phoneView) {
        this.view = phoneView;
    }

    @Override
    public void loginUsingPhone(String phoneNumber) {
        view.showProgressBar();
        PhoneAuthProvider.getInstance().verifyPhoneNumber(AppConstants.COUNTRY_CODE_IN.concat(phoneNumber), 60L, TimeUnit.SECONDS, TaskExecutors.MAIN_THREAD, new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                view.dismissProgressBar();
            }

            @Override
            public void onVerificationFailed(FirebaseException e) {
                view.dismissProgressBar();
            }
        });
    }
}
