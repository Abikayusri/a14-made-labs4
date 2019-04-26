package com.dicoding.picodiploma.mynoteapps.ui.main;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.dicoding.picodiploma.mynoteapps.database.Note;
import com.dicoding.picodiploma.mynoteapps.repository.NoteRepository;

import java.util.List;

public class MainViewModel extends ViewModel {

    private NoteRepository mNoteRepository;

    public MainViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }

    LiveData<List<Note>> getAllNotes() {
        return mNoteRepository.getAllNotes();
    }
}
