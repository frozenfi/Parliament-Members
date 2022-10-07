package com.example.parliamentapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/parliamentapplication/viewmodel/CommentViewModel;", "Landroidx/lifecycle/ViewModel;", "feedbackRepo", "Lcom/example/parliamentapplication/repo/FeedbackRepo;", "personNumber", "", "(Lcom/example/parliamentapplication/repo/FeedbackRepo;I)V", "_member", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/example/parliamentapplication/ParliamentMembers;", "_memberFeedback", "Lcom/example/parliamentapplication/data/Feedback;", "member", "getMember", "()Landroidx/lifecycle/LiveData;", "memberFeedback", "getMemberFeedback", "updateFeedback", "", "addComment", "", "app_debug"})
public final class CommentViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.parliamentapplication.repo.FeedbackRepo feedbackRepo = null;
    private androidx.lifecycle.MutableLiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> _member;
    private androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.data.Feedback> _memberFeedback;
    
    public CommentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.repo.FeedbackRepo feedbackRepo, int personNumber) {
        super();
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