package com.example.parliamentapplication.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/parliamentapplication/data/TypeConverter;", "", "()V", "convertCommentsToString", "", "commentList", "", "convertStringToComment", "", "storedString", "Companion", "app_debug"})
public final class TypeConverter {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.parliamentapplication.data.TypeConverter.Companion Companion = null;
    
    public TypeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String convertCommentsToString(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> commentList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<java.lang.String> convertStringToComment(@org.jetbrains.annotations.NotNull()
    java.lang.String storedString) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u0004H\u0003\u00a8\u0006\n"}, d2 = {"Lcom/example/parliamentapplication/data/TypeConverter$Companion;", "", "()V", "commentToString", "", "listOfComment", "", "stringToComment", "", "storedString", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.room.TypeConverter()
        @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
        private final java.util.List<java.lang.String> stringToComment(java.lang.String storedString) {
            return null;
        }
        
        @androidx.room.TypeConverter()
        private final java.lang.String commentToString(java.util.List<java.lang.String> listOfComment) {
            return null;
        }
    }
}