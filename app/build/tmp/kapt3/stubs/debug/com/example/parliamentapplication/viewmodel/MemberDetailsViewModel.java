package com.example.parliamentapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/example/parliamentapplication/viewmodel/MemberDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "membersRepo", "Lcom/example/parliamentapplication/repo/MembersRepo;", "personNumber", "", "application", "Landroid/app/Application;", "(Lcom/example/parliamentapplication/repo/MembersRepo;ILandroid/app/Application;)V", "_memberComment", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/parliamentapplication/data/Feedback;", "_navigateToComment", "_selectMember", "Lcom/example/parliamentapplication/ParliamentMembers;", "_selectedMember", "Landroidx/lifecycle/LiveData;", "feedbackDatabase", "Lcom/example/parliamentapplication/data/FeedbackDatabase;", "feedbackRepo", "Lcom/example/parliamentapplication/repo/FeedbackRepo;", "memberComment", "getMemberComment", "()Landroidx/lifecycle/LiveData;", "navigateToComment", "getNavigateToComment", "()Landroidx/lifecycle/MutableLiveData;", "selectMember", "getSelectMember", "selectedMember", "getSelectedMember", "navigateToCommentCompleted", "", "onAddCommentBtnClicked", "feedback", "app_debug"})
public final class MemberDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.parliamentapplication.data.FeedbackDatabase feedbackDatabase = null;
    private final com.example.parliamentapplication.repo.FeedbackRepo feedbackRepo = null;
    private androidx.lifecycle.MutableLiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> _selectedMember;
    private androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.ParliamentMembers> _selectMember;
    private androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.data.Feedback> _memberComment;
    private final androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.data.Feedback> _navigateToComment = null;
    
    public MemberDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.repo.MembersRepo membersRepo, int personNumber, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> getSelectedMember() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> getSelectMember() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.data.Feedback> getMemberComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.data.Feedback> getNavigateToComment() {
        return null;
    }
    
    public final void onAddCommentBtnClicked(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.Feedback feedback) {
    }
    
    public final void navigateToCommentCompleted() {
    }
}