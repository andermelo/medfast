package com.medfest.android.medfestapp.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/medfest/android/medfestapp/presentation/implementation/WelcomePresenterImpl;", "Lcom/medfest/android/medfestapp/presentation/WelcomePresenter;", "authenticationInterface", "Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;", "(Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;)V", "view", "Lcom/medfest/android/medfestapp/ui/welcome/WelcomeView;", "setView", "", "viewReady", "app_debug"})
public final class WelcomePresenterImpl implements com.medfest.android.medfestapp.presentation.WelcomePresenter {
    private com.medfest.android.medfestapp.ui.welcome.WelcomeView view;
    private final com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.ui.welcome.WelcomeView view) {
    }
    
    @java.lang.Override()
    public void viewReady() {
    }
    
    @javax.inject.Inject()
    public WelcomePresenterImpl(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface) {
        super();
    }
}