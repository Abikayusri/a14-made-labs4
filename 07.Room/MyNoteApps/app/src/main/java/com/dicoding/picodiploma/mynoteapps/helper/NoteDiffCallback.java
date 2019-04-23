package com.dicoding.picodiploma.mynoteapps.helper;

import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;

import com.dicoding.picodiploma.mynoteapps.database.Note;

import java.util.List;

public class NoteDiffCallback extends DiffUtil.Callback {

    private final List<Note> mOldNoteList;
    private final List<Note> mNewNoteList;

    public NoteDiffCallback(List<Note> oldNoteList, List<Note> newNoteList) {
        this.mOldNoteList = oldNoteList;
        this.mNewNoteList = newNoteList;
    }

    @Override
    public int getOldListSize() {
        return mOldNoteList.size();
    }

    @Override
    public int getNewListSize() {
        return mNewNoteList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return mOldNoteList.get(oldItemPosition).getId() == mNewNoteList.get(newItemPosition).getId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        final Note oldEmployee = mOldNoteList.get(oldItemPosition);
        final Note newEmployee = mNewNoteList.get(newItemPosition);

        return oldEmployee.getTitle().equals(newEmployee.getTitle());
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        // Implement method if you're going to use ItemAnimator
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }
}