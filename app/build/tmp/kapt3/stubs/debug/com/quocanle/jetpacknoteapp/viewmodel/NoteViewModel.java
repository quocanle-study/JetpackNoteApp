package com.quocanle.jetpacknoteapp.viewmodel;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.quocanle.jetpacknoteapp.data.NoteRepository;
import com.quocanle.jetpacknoteapp.model.Note;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/quocanle/jetpacknoteapp/viewmodel/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/quocanle/jetpacknoteapp/data/NoteRepository;", "(Lcom/quocanle/jetpacknoteapp/data/NoteRepository;)V", "_noteList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/quocanle/jetpacknoteapp/model/Note;", "noteList", "Lkotlinx/coroutines/flow/StateFlow;", "getNoteList", "()Lkotlinx/coroutines/flow/StateFlow;", "addNote", "", "note", "fetchNotes", "removeNote", "updateNote", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class NoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.quocanle.jetpacknoteapp.data.NoteRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.quocanle.jetpacknoteapp.model.Note>> _noteList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.quocanle.jetpacknoteapp.model.Note>> noteList = null;
    
    @javax.inject.Inject
    public NoteViewModel(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.data.NoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.quocanle.jetpacknoteapp.model.Note>> getNoteList() {
        return null;
    }
    
    private final void fetchNotes() {
    }
    
    public final void addNote(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.model.Note note) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.model.Note note) {
    }
    
    public final void removeNote(@org.jetbrains.annotations.NotNull
    com.quocanle.jetpacknoteapp.model.Note note) {
    }
}