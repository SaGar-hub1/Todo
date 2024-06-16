package com.todoapp.controller;

import com.todoapp.entity.notes;
import com.todoapp.repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class noteController {
    @Autowired
    private NoteRepo noteRepo;
    @GetMapping("/notes")
    List<notes> getAllNotes(){
        return noteRepo.findAll();
    }
}
