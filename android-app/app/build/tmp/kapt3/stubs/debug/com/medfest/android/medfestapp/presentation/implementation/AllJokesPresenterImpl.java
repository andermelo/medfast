package com.medfest.android.medfestapp.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/medfest/android/medfestapp/presentation/implementation/AllJokesPresenterImpl;", "Lcom/medfest/android/medfestapp/presentation/AllJokesPresenter;", "authenticationInterface", "Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;", "databaseInterface", "Lcom/medfest/android/medfestapp/firebase/database/FirebaseDatabaseInterface;", "(Lcom/medfest/android/medfestapp/firebase/authentication/FirebaseAuthenticationInterface;Lcom/medfest/android/medfestapp/firebase/database/FirebaseDatabaseInterface;)V", "view", "Lcom/medfest/android/medfestapp/ui/jokes/all/AllJokesView;", "getAllJokes", "", "onFavoriteButtonTapped", "joke", "Lcom/medfest/android/medfestapp/model/Joke;", "setView", "viewReady", "app_debug"})
public final class AllJokesPresenterImpl implements com.medfest.android.medfestapp.presentation.AllJokesPresenter {
    private com.medfest.android.medfestapp.ui.jokes.all.AllJokesView view;
    private final com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface = null;
    private final com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface databaseInterface = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.ui.jokes.all.AllJokesView view) {
    }
    
    @java.lang.Override()
    public void viewReady() {
    }
    
    @java.lang.Override()
    public void getAllJokes() {
    }
    
    @java.lang.Override()
    public void onFavoriteButtonTapped(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.model.Joke joke) {
    }
    
    @javax.inject.Inject()
    public AllJokesPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface, @org.jetbrains.annotations.NotNull()
    com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface databaseInterface) {
        super();
    }
}