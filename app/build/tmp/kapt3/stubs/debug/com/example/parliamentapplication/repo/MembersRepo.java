package com.example.parliamentapplication.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\tJ\u0011\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/parliamentapplication/repo/MembersRepo;", "", "memberDatabaseDao", "Lcom/example/parliamentapplication/data/membersdata/MemberOfParliamentDao;", "(Lcom/example/parliamentapplication/data/membersdata/MemberOfParliamentDao;)V", "_status", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/parliamentapplication/api/ParliamentApiStatus;", "status", "Landroidx/lifecycle/LiveData;", "getStatus", "()Landroidx/lifecycle/LiveData;", "getMembersByParty", "", "Lcom/example/parliamentapplication/ParliamentMembers;", "party", "", "getMembersWithPersonNumber", "id", "", "getParties", "refreshData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MembersRepo {
    private final com.example.parliamentapplication.data.membersdata.MemberOfParliamentDao memberDatabaseDao = null;
    private final androidx.lifecycle.MutableLiveData<com.example.parliamentapplication.api.ParliamentApiStatus> _status = null;
    
    public MembersRepo(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.data.membersdata.MemberOfParliamentDao memberDatabaseDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.api.ParliamentApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.parliamentapplication.ParliamentMembers>> getMembersByParty(@org.jetbrains.annotations.NotNull()
    java.lang.String party) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getParties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> getMembersWithPersonNumber(int id) {
        return null;
    }
}