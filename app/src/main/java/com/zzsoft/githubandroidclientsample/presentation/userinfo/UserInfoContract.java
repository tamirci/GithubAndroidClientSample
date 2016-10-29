package com.zzsoft.githubandroidclientsample.presentation.userinfo;

import com.zzsoft.githubandroidclientsample.data.entities.GithubUserItem;
import com.zzsoft.githubandroidclientsample.presentation.base.BasePresenter;
import com.zzsoft.githubandroidclientsample.presentation.base.BaseView;

/**
 * Created by zztamirci on 29-10-16.
 */

public interface UserInfoContract {

    interface View extends BaseView<Presenter>{
        void showUserInfo(GithubUserItem githubUserItem);
        void hideUserInfo();
        void showLoading();
        void hideLoading();
        void showErrorView();
        void hideErrorView();
    }

    interface Presenter extends BasePresenter{
        void loadUserInfo();
    }
}
