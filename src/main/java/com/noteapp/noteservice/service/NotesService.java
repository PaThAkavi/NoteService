package com.noteapp.noteservice.service;
import com.noteapp.noteservice.model.entity.Note;
import java.util.List;
import java.util.Optional;

public interface NotesService {
    public List<Note> getAllNotes();
    public Optional<Note> getNote(String id);
    public Note addNote(Note note);
    public Note editNote(String id);
}
