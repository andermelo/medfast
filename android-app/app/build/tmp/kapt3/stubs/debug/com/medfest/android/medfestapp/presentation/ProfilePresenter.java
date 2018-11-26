package com.medfest.android.medfestapp.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/medfest/android/medfestapp/presentation/ProfilePresenter;", "Lcom/medfest/android/medfestapp/presentation/BasePresenter;", "Lcom/medfest/android/medfestapp/ui/profile/ProfileView;", "getProfile", "", "logOut", "app_debug"})
public abstract interface ProfilePresenter extends com.medfest.android.medfestapp.presentation.BasePresenter<com.medfest.android.medfestapp.ui.profile.ProfileView> {
    
    public abstract void getProfile();
    
    public abstract void logOut();
}