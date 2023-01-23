package com.example.notesapp.listeners;

import com.example.notesapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
