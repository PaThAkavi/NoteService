package com.noteapp.noteservice.controller;

import com.noteapp.noteservice.model.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.noteapp.noteservice.service.NotesService;

import java.util.List;
import java.util.Optional;

@RestController
public class NotesController {
    @Autowired
    private NotesService notesService;
    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return notesService.getAllNotes();
    }

    @GetMapping("/note/{id}")
    public Optional<Note> getNote(@PathVariable String id) {
        return notesService.getNote(id);
    }

    @PostMapping(path = "/notes", consumes = "application/json")
    public Note addNote(@RequestBody Note note) {
        return notesService.addNote(note);
    }

    @PutMapping("/notes")
    public Note editNote(@PathVariable String id) {
        return notesService.editNote(id);
    }
}
