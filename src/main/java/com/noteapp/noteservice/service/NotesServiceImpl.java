package com.noteapp.noteservice.service;

import com.noteapp.noteservice.model.dao.NoteDao;
import com.noteapp.noteservice.model.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NoteDao noteDao;

    @Override
    public List<Note> getAllNotes() {
//        return notes;
        return noteDao.findAll();
    }

    @Override
    public Optional<Note> getNote(String id) {
        return noteDao.findById(id);
    }

    @Override
    public Note addNote(Note note) {
        return noteDao.insert(note);
    }

    @Override
    public Note editNote(Note note) {
        return noteDao.save(note);
    }

    @Override
    public void deleteNote(String id) {
        noteDao.deleteById(id);
    }
}
