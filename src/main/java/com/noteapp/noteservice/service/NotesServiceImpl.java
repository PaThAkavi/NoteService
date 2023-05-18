package com.noteapp.noteservice.service;

import com.noteapp.noteservice.model.entity.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NotesServiceImpl implements NotesService {

    private List<Note> notes;

    public NotesServiceImpl() {
        notes = new ArrayList<>();
        notes.add(new Note("123", "Name", "Avaneesh Kumar Pathak"));
        notes.add(new Note("124", "Name", "Ashu Kumar Roy"));
    }

    @Override
    public List<Note> getAllNotes() {
        return notes;
    }

    @Override
    public Optional<Note> getNote(String id) {
        Optional<Note> note;
        note = notes.stream().filter((noteItem) -> noteItem.getId().equals(id)).findFirst();
        return note;
    }

    @Override
    public Note addNote(Note note) {
        notes.add(note);
        return note;
    }

    @Override
    public Note editNote(Note note) {
        for (Note item: notes) {
            if(item.getId().equals(note.getId())) {
                item.setTitle(note.getTitle());
                item.setBody(note.getBody());
                break;
            }
        }
        return note;
    }

    @Override
    public void deleteNote(String id) {
        notes = notes.stream().filter(note -> !Objects.equals(note.getId(), id)).collect(Collectors.toList());
    }
}
