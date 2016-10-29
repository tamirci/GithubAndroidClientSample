package com.zzsoft.githubandroidclientsample.presentation.userinfo;

/**
 * Created by zztamirci on 29-10-16.
 */

public class UserInfoPresenter implements UserInfoContract.Presenter {

    private UserInfoContract.View mUserInfoView;

    public UserInfoPresenter(UserInfoContract.View userInfoView){
        mUserInfoView = userInfoView;
        userInfoView.setPresenter(this);
    }

    @Override
    public void loadUserInfo() {
        mUserInfoView.hideErrorView();
        mUserInfoView.hideUserInfo();
        mUserInfoView.showLoading();
    }

    @Override
    public void start() {
        loadUserInfo();
    }
}
