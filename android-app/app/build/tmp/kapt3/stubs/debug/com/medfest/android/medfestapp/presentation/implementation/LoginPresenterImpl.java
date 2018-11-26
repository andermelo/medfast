package com.medfest.android.medfestapp.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/medfest/android/medfestapp/presentation/implementation/LoginPresenterImpl;", "Lcom/medfest/android/medfestapp/presentation/LoginPresenter;", "authentication", "Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;", "(Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;)V", "loginRequest", "Lcom/medfest/android/medfestapp/model/LoginRequest;", "view", "Lcom/medfest/android/medfestapp/ui/login/LoginView;", "onEmailChanged", "", "email", "", "onLoginTapped", "onPasswordChanged", "password", "setView", "app_debug"})
public final class LoginPresenterImpl implements com.medfest.android.medfestapp.presentation.LoginPresenter {
    private com.medfest.android.medfestapp.ui.login.LoginView view;
    private final com.medfest.android.medfestapp.model.LoginRequest loginRequest = null;
    private final com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authentication = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.ui.login.LoginView view) {
    }
    
    @java.lang.Override()
    public void onLoginTapped() {
    }
    
    @java.lang.Override()
    public void onEmailChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @java.lang.Override()
    public void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @javax.inject.Inject()
    public LoginPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authentication) {
        super();
    }
}