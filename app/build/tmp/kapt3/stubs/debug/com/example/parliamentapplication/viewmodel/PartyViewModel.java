package com.example.parliamentapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/parliamentapplication/viewmodel/PartyViewModel;", "Landroidx/lifecycle/ViewModel;", "membersRepo", "Lcom/example/parliamentapplication/repo/MembersRepo;", "(Lcom/example/parliamentapplication/repo/MembersRepo;)V", "_navigateToPartySelected", "Landroidx/lifecycle/MutableLiveData;", "", "navigateToPartySelected", "getNavigateToPartySelected", "()Landroidx/lifecycle/MutableLiveData;", "parties", "Landroidx/lifecycle/LiveData;", "", "getParties", "()Landroidx/lifecycle/LiveData;", "status", "Lcom/example/parliamentapplication/api/ParliamentApiStatus;", "getStatus", "onNavigateToPartySelected", "", "onPartyClicked", "party", "app_debug"})
public final class PartyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> parties = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.parliamentapplication.api.ParliamentApiStatus> status = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _navigateToPartySelected = null;
    
    public PartyViewModel(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.repo.MembersRepo membersRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getParties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.api.ParliamentApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNavigateToPartySelected() {
        return null;
    }
    
    public final void onPartyClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String party) {
    }
    
    public final void onNavigateToPartySelected() {
    }
}