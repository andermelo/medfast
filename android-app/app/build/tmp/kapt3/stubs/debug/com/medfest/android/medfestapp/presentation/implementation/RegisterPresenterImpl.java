package com.medfest.android.medfestapp.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/medfest/android/medfestapp/presentation/implementation/RegisterPresenterImpl;", "Lcom/medfest/android/medfestapp/presentation/RegisterPresenter;", "database", "Lcom/medfest/android/medfestapp/firebase/database/FirebaseDatabaseInterface;", "authentication", "Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;", "(Lcom/medfest/android/medfestapp/firebase/database/FirebaseDatabaseInterface;Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;)V", "userData", "Lcom/medfest/android/medfestapp/model/RegisterRequest;", "view", "Lcom/medfest/android/medfestapp/ui/register/RegisterView;", "createUser", "", "name", "", "email", "onEmailChanged", "onPasswordChanged", "password", "onRegisterResult", "isSuccessful", "", "onRegisterTapped", "onRepeatPasswordChanged", "repeatPassword", "onUsernameChanged", "username", "setView", "app_debug"})
public final class RegisterPresenterImpl implements com.medfest.android.medfestapp.presentation.RegisterPresenter {
    private com.medfest.android.medfestapp.ui.register.RegisterView view;
    private final com.medfest.android.medfestapp.model.RegisterRequest userData = null;
    private final com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface database = null;
    private final com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authentication = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.ui.register.RegisterView view) {
    }
    
    @java.lang.Override()
    public void onUsernameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @java.lang.Override()
    public void onEmailChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @java.lang.Override()
    public void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @java.lang.Override()
    public void onRepeatPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String repeatPassword) {
    }
    
    @java.lang.Override()
    public void onRegisterTapped() {
    }
    
    private final void onRegisterResult(boolean isSuccessful, java.lang.String name, java.lang.String email) {
    }
    
    private final void createUser(java.lang.String name, java.lang.String email) {
    }
    
    @javax.inject.Inject()
    public RegisterPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface database, @org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authentication) {
        super();
    }
}