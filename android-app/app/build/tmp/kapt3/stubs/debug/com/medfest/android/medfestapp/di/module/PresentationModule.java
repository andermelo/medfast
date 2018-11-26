package com.medfest.android.medfestapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\'\u00a8\u0006\u001d"}, d2 = {"Lcom/medfest/android/medfestapp/di/module/PresentationModule;", "", "()V", "addJokePresenter", "Lcom/medfest/android/medfestapp/presentation/AddJokePresenter;", "addJokePresenterImpl", "Lcom/medfest/android/medfestapp/presentation/implementation/AddJokePresenterImpl;", "allJokesPresenter", "Lcom/medfest/android/medfestapp/presentation/AllJokesPresenter;", "allJokesPresenterImpl", "Lcom/medfest/android/medfestapp/presentation/implementation/AllJokesPresenterImpl;", "favoriteJokesPresenter", "Lcom/medfest/android/medfestapp/presentation/FavoriteJokesPresenter;", "favoriteJokesPresenterImpl", "Lcom/medfest/android/medfestapp/presentation/implementation/FavoriteJokesPresenterImpl;", "loginPresenter", "Lcom/medfest/android/medfestapp/presentation/LoginPresenter;", "Lcom/medfest/android/medfestapp/presentation/implementation/LoginPresenterImpl;", "profilePresenter", "Lcom/medfest/android/medfestapp/presentation/ProfilePresenter;", "profilePresenterImpl", "Lcom/medfest/android/medfestapp/presentation/implementation/ProfilePresenterImpl;", "registerPresenter", "Lcom/medfest/android/medfestapp/presentation/RegisterPresenter;", "Lcom/medfest/android/medfestapp/presentation/implementation/RegisterPresenterImpl;", "welcomePresenter", "Lcom/medfest/android/medfestapp/presentation/WelcomePresenter;", "welcomePresenterImpl", "Lcom/medfest/android/medfestapp/presentation/implementation/WelcomePresenterImpl;", "app_debug"})
@dagger.Module(includes = {com.medfest.android.medfestapp.di.module.InteractionModule.class})
public abstract class PresentationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.medfest.android.medfestapp.presentation.LoginPresenter loginPresenter(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.presentation.implementation.LoginPresenterImpl loginPresenter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.medfest.android.medfestapp.presentation.RegisterPresenter registerPresenter(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.presentation.implementation.RegisterPresenterImpl registerPresenter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.medfest.android.medfestapp.presentation.AllJokesPresenter allJokesPresenter(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.presentation.implementation.AllJokesPresenterImpl allJokesPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.medfest.android.medfestapp.presentation.FavoriteJokesPresenter favoriteJokesPresenter(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.presentation.implementation.FavoriteJokesPresenterImpl favoriteJokesPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.medfest.android.medfestapp.presentation.ProfilePresenter profilePresenter(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.presentation.implementation.ProfilePresenterImpl profilePresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.medfest.android.medfestapp.presentation.AddJokePresenter addJokePresenter(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.presentation.implementation.AddJokePresenterImpl addJokePresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.medfest.android.medfestapp.presentation.WelcomePresenter welcomePresenter(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.presentation.implementation.WelcomePresenterImpl welcomePresenterImpl);
    
    public PresentationModule() {
        super();
    }
}