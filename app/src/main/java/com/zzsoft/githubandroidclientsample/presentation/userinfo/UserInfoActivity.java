package com.zzsoft.githubandroidclientsample.presentation.userinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zzsoft.githubandroidclientsample.R;
import com.zzsoft.githubandroidclientsample.data.entities.GithubUserItem;

public class UserInfoActivity extends AppCompatActivity implements UserInfoContract.View {


    UserInfoContract.Presenter mUserInfoPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        mUserInfoPresenter = new UserInfoPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mUserInfoPresenter.start();
    }

    @Override
    public void showUserInfo(GithubUserItem githubUserItem) {

    }

    @Override
    public void hideUserInfo() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showErrorView() {

    }

    @Override
    public void hideErrorView() {

    }

    @Override
    public void setPresenter(UserInfoContract.Presenter presenter) {
        mUserInfoPresenter = presenter;
    }
}
