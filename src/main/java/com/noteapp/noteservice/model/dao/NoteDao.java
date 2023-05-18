package com.noteapp.noteservice.model.dao;

import com.noteapp.noteservice.model.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteDao extends MongoRepository<Note, String> {

}