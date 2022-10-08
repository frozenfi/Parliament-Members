package com.example.parliamentapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/example/parliamentapplication/viewmodel/CommentViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "feedback", "Lcom/example/parliamentapplication/data/Feedback;", "application", "Landroid/app/Application;", "(Lcom/example/parliamentapplication/data/Feedback;Landroid/app/Application;)V", "_member", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/example/parliamentapplication/ParliamentMembers;", "_memberFeedback", "feedbackDatabase", "Lcom/example/parliamentapplication/data/FeedbackDatabase;", "feedbackRepo", "Lcom/example/parliamentapplication/repo/FeedbackRepo;", "member", "getMember", "()Landroidx/lifecycle/LiveData;", "memberFeedback", "getMemberFeedback", "updateFeedback", "", "addComment", "", "app_debug"})
public final class CommentViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.parliamentapplication.data.FeedbackDatabase feedbackDatabase = null;
    private final com.example.parliamentapplication.repo.FeedbackRepo feedbackRepo = null;
    private androidx.lifecycle.MutableLiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> _member;
    private androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.data.Feedback> _memberFeedback;
    
    public CommentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.Feedback feedback, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> getMember() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.data.Feedback> getMemberFeedback() {
        return null;
    }
    
    public final void updateFeedback(@org.jetbrains.annotations.NotNull()
    java.lang.String addComment) {
    }
}