package com.example.parliamentapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/example/parliamentapplication/viewmodel/MemberViewModel;", "Landroidx/lifecycle/ViewModel;", "membersRepo", "Lcom/example/parliamentapplication/repo/MembersRepo;", "party", "", "(Lcom/example/parliamentapplication/repo/MembersRepo;Ljava/lang/String;)V", "_navigateToMemberDetails", "Landroidx/lifecycle/MutableLiveData;", "", "navigateToParliamentMemberDetails", "getNavigateToParliamentMemberDetails", "()Landroidx/lifecycle/MutableLiveData;", "parliamentMembers", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/parliamentapplication/ParliamentMembers;", "getParliamentMembers", "()Landroidx/lifecycle/LiveData;", "onMemberClicked", "", "id", "onMemberDetailNavigated", "app_debug"})
public final class MemberViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _navigateToMemberDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.parliamentapplication.ParliamentMembers>> parliamentMembers = null;
    
    public MemberViewModel(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.repo.MembersRepo membersRepo, @org.jetbrains.annotations.NotNull()
    java.lang.String party) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNavigateToParliamentMemberDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.parliamentapplication.ParliamentMembers>> getParliamentMembers() {
        return null;
    }
    
    public final void onMemberClicked(int id) {
    }
    
    public final void onMemberDetailNavigated() {
    }
}