package com.todoapp.controller;

import com.todoapp.entity.notes;
import com.todoapp.repository.NoteRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class noteController {
    @Autowired
    private NoteRepo noteRepo;
    @GetMapping("/notes")
    List<notes> getAllNotes(){
        return noteRepo.findAll();
    }
    @GetMapping("/notes/{id}")
    Optional<notes> findnotebyid(@PathVariable ("id") Long id){
        return noteRepo.findById(id);
    }
}
