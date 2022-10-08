package com.example.parliamentapplication.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/parliamentapplication/repo/FeedbackRepo;", "", "feedbackDatabase", "Lcom/example/parliamentapplication/data/FeedbackDatabase;", "(Lcom/example/parliamentapplication/data/FeedbackDatabase;)V", "feedbackDao", "Lcom/example/parliamentapplication/data/FeedbackDao;", "getMemberFeedback", "Lcom/example/parliamentapplication/data/Feedback;", "personNumber", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFeedback", "", "feedback", "(Lcom/example/parliamentapplication/data/Feedback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FeedbackRepo {
    private final com.example.parliamentapplication.data.FeedbackDatabase feedbackDatabase = null;
    private final com.example.parliamentapplication.data.FeedbackDao feedbackDao = null;
    
    public FeedbackRepo(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.FeedbackDatabase feedbackDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFeedback(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.Feedback feedback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMemberFeedback(int personNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.parliamentapplication.data.Feedback> continuation) {
        return null;
    }
}