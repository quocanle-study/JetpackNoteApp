package com.quocanle.jetpacknoteapp.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.quocanle.jetpacknoteapp.model.Note;
import kotlinx.coroutines.flow.Flow;
import java.util.UUID;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000fH\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u000eH\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u000eH\'J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0018\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/quocanle/jetpacknoteapp/data/NoteDatabaseDao;", "", "delete", "", "note", "Lcom/quocanle/jetpacknoteapp/model/Note;", "(Lcom/quocanle/jetpacknoteapp/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllNotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNoteById", "noteId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteById", "Lkotlinx/coroutines/flow/Flow;", "", "getNotes", "", "getNotesOrderDESC", "insert", "insertAll", "notes", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateAll", "app_debug"})
@androidx.room.Dao
public abstract interface NoteDatabaseDao {
    
    @androidx.room.Query(value = "SELECT * FROM note_table ORDER BY entryDate DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.quocanle.jetpacknoteapp.model.Note>> getNotesOrderDESC();
    
    @androidx.room.Query(value = "SELECT * FROM note_table")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.quocanle.jetpacknoteapp.model.Note>> getNotes();
    
    @androidx.room.Query(value = "SELECT * FROM note_table WHERE id= :noteId")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.quocanle.jetpacknoteapp.model.Note> getNoteById(@org.jetbrains.annotations.NotNull
    java.util.UUID noteId);
    
    @androidx.room.Query(value = "SELECT * FROM note_table WHERE id= :noteId")
    @org.jetbrains.annotations.NotNull
    public abstract com.quocanle.jetpacknoteapp.model.Note getNoteById(@org.jetbrains.annotations.NotNull
    java.lang.String noteId);
    
    @androidx.room.Query(value = "DELETE FROM note_table")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllNotes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM note_table WHERE id= :noteId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNoteById(@org.jetbrains.annotations.NotNull
    java.util.UUID noteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.quocanle.jetpacknoteapp.model.Note> notes, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.quocanle.jetpacknoteapp.model.Note> notes, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}