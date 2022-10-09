package com.example.parliamentapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0006R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/example/parliamentapplication/viewmodel/MemberDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/example/parliamentapplication/utils/ViewModelUtils;", "membersRepo", "Lcom/example/parliamentapplication/repo/MembersRepo;", "personNumber", "", "(Lcom/example/parliamentapplication/repo/MembersRepo;I)V", "_memberComment", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/parliamentapplication/data/Feedback;", "_navigateToComment", "_selectMember", "Lcom/example/parliamentapplication/ParliamentMembers;", "_selectedMember", "Landroidx/lifecycle/LiveData;", "member", "getMember", "()Landroidx/lifecycle/LiveData;", "memberComment", "getMemberComment", "navigateToComment", "getNavigateToComment", "selectMember", "getSelectMember", "navigateToCommentCompleted", "", "onAddCommentBtnClicked", "feedback", "updateFeedback", "newRating", "app_debug"})
public final class MemberDetailsViewModel extends androidx.lifecycle.ViewModel implements com.example.parliamentapplication.utils.ViewModelUtils {
    private androidx.lifecycle.MutableLiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> _selectedMember;
    private androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.ParliamentMembers> _selectMember;
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
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> getSelectMember() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.parliamentapplication.data.Feedback> getMemberComment() {
        return null;
    }
    
    public final void updateFeedback(int newRating) {
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
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String rating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String updateAge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String updateParty() {
        return null;
    }
}