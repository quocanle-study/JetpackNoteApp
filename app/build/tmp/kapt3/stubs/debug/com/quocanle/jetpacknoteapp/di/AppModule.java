package com.quocanle.jetpacknoteapp.di;

import android.content.Context;
import androidx.room.Room;
import com.quocanle.jetpacknoteapp.data.NoteDatabase;
import com.quocanle.jetpacknoteapp.data.NoteDatabaseDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/quocanle/jetpacknoteapp/di/AppModule;", "", "()V", "provideAppDatabase", "Lcom/quocanle/jetpacknoteapp/data/NoteDatabase;", "context", "Landroid/content/Context;", "provideNotesDao", "Lcom/quocanle/jetpacknoteapp/data/NoteDatabaseDao;", "noteDatabase", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.quocanle.jetpacknoteapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.quocanle.jetpacknoteapp.data.NoteDatabaseDao provideNotesDao(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.data.NoteDatabase noteDatabase) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.quocanle.jetpacknoteapp.data.NoteDatabase provideAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}