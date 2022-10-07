package com.example.parliamentapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/example/parliamentapplication/viewmodel/MemberDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "membersRepo", "Lcom/example/parliamentapplication/repo/MembersRepo;", "personNumber", "", "(Lcom/example/parliamentapplication/repo/MembersRepo;I)V", "_memberComment", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/parliamentapplication/data/Feedback;", "_navigateToComment", "_selectedMember", "Landroidx/lifecycle/LiveData;", "Lcom/example/parliamentapplication/ParliamentMembers;", "member", "getMember", "()Landroidx/lifecycle/LiveData;", "memberComment", "getMemberComment", "navigateToComment", "getNavigateToComment", "navigateToCommentCompleted", "", "onAddCommentBtnClicked", "feedback", "app_debug"})
public final class MemberDetailsViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> _selectedMember;
    private androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.data.Feedback> _memberComment;
    private final androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.data.Feedback> _navigateToComment = null;
    
    public MemberDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.repo.MembersRepo membersRepo, int personNumber) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> getMember() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.data.Feedback> getMemberComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.data.Feedback> getNavigateToComment() {
        return null;
    }
    
    public final void onAddCommentBtnClicked(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.Feedback feedback) {
    }
    
    public final void navigateToCommentCompleted() {
    }
}