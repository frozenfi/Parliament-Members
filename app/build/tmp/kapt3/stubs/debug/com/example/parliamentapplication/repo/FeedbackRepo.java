package com.example.parliamentapplication.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/parliamentapplication/repo/FeedbackRepo;", "", "feedbackDao", "Lcom/example/parliamentapplication/data/FeedbackDao;", "(Lcom/example/parliamentapplication/data/FeedbackDao;)V", "_status", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/parliamentapplication/api/ParliamentApiStatus;", "status", "Landroidx/lifecycle/LiveData;", "getStatus", "()Landroidx/lifecycle/LiveData;", "getFeedback", "Lcom/example/parliamentapplication/data/Feedback;", "personNumber", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFeedback", "", "member", "(Lcom/example/parliamentapplication/data/Feedback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshFeedbackData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FeedbackRepo {
    private final com.example.parliamentapplication.data.FeedbackDao feedbackDao = null;
    private final androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.api.ParliamentApiStatus> _status = null;
    
    public FeedbackRepo(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.FeedbackDao feedbackDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.api.ParliamentApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshFeedbackData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFeedback(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.Feedback member, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFeedback(int personNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.parliamentapplication.data.Feedback> continuation) {
        return null;
    }
}