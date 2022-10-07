package com.example.parliamentapplication.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b0\u0003H\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u0003H\'J\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/parliamentapplication/data/MemberOfParliamentDao;", "", "getMemberById", "Landroidx/lifecycle/LiveData;", "Lcom/example/parliamentapplication/ParliamentMembers;", "personNumber", "", "getMembersByParty", "", "party", "", "getParliamentMembers", "getParties", "getPartiesList", "Lcom/example/parliamentapplication/Party;", "insertAll", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "member", "(Lcom/example/parliamentapplication/ParliamentMembers;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MemberOfParliamentDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.parliamentapplication.ParliamentMembers> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.parliamentapplication.ParliamentMembers member, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM parliament_database")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.parliamentapplication.ParliamentMembers>> getParliamentMembers();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT DISTINCT party FROM parliament_database ORDER BY party")
    public abstract androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getParties();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM parliament_database WHERE personNumber = :personNumber")
    public abstract androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> getMemberById(int personNumber);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM parliament_database WHERE party = :party ORDER BY full_name ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.parliamentapplication.ParliamentMembers>> getMembersByParty(@org.jetbrains.annotations.NotNull()
    java.lang.String party);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM parliament_database GROUP BY party ORDER BY party ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.parliamentapplication.Party>> getPartiesList();
}