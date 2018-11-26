package com.medfest.android.medfestapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lcom/medfest/android/medfestapp/di/AppComponent;", "", "addJokePresenter", "Lcom/medfest/android/medfestapp/presentation/AddJokePresenter;", "allJokesPresenter", "Lcom/medfest/android/medfestapp/presentation/AllJokesPresenter;", "favoriteJokesPresenter", "Lcom/medfest/android/medfestapp/presentation/FavoriteJokesPresenter;", "loginPresenter", "Lcom/medfest/android/medfestapp/presentation/LoginPresenter;", "profilePresenter", "Lcom/medfest/android/medfestapp/presentation/ProfilePresenter;", "registerPresenter", "Lcom/medfest/android/medfestapp/presentation/RegisterPresenter;", "welcomePresenter", "Lcom/medfest/android/medfestapp/presentation/WelcomePresenter;", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.medfest.android.medfestapp.di.module.PresentationModule.class})
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.medfest.android.medfestapp.presentation.RegisterPresenter registerPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.medfest.android.medfestapp.presentation.LoginPresenter loginPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.medfest.android.medfestapp.presentation.AllJokesPresenter allJokesPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.medfest.android.medfestapp.presentation.FavoriteJokesPresenter favoriteJokesPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.medfest.android.medfestapp.presentation.ProfilePresenter profilePresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.medfest.android.medfestapp.presentation.AddJokePresenter addJokePresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.medfest.android.medfestapp.presentation.WelcomePresenter welcomePresenter();
}