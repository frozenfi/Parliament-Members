package com.example.parliamentapplication.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/parliamentapplication/utils/ViewModelUtils;", "", "memberComment", "Landroidx/lifecycle/LiveData;", "Lcom/example/parliamentapplication/data/Feedback;", "getMemberComment", "()Landroidx/lifecycle/LiveData;", "selectMember", "Lcom/example/parliamentapplication/ParliamentMembers;", "getSelectMember", "updateAge", "", "updateParty", "app_debug"})
public abstract interface ViewModelUtils {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> getSelectMember();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.parliamentapplication.data.Feedback> getMemberComment();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String updateAge();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String updateParty();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String updateAge(@org.jetbrains.annotations.NotNull()
        com.example.parliamentapplication.utils.ViewModelUtils $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String updateParty(@org.jetbrains.annotations.NotNull()
        com.example.parliamentapplication.utils.ViewModelUtils $this) {
            return null;
        }
    }
}