package com.bridge.mvpbase.ui.authentication.login;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.bridge.mvpbase.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class PhoneLoginFragment extends Fragment implements PhoneView {

    @BindView(R.id.tie_phone_number)
    TextInputEditText tiePhoneNumber;
    @BindView(R.id.til_phone_number)
    TextInputLayout tilPhoneNumber;
    @BindView(R.id.btn_continue)
    ProgressBar progressBar;
    @BindView(R.id.progress)
    Button btnContinue;
    Unbinder unbinder;
    PhonePresenter presenter;

    public PhoneLoginFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_phone_login, container, false);
        unbinder = ButterKnife.bind(this, view);
        presenter = new PhonePresenterImpl();
        presenter.setView(this);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.btn_continue)
    public void onViewClicked() {
        presenter.loginUsingPhone(tiePhoneNumber.getText().toString());
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgressBar() {
        progressBar.setVisibility(View.GONE);
    }
}