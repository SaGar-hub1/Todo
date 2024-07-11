package com.todoapp.controller;

import com.todoapp.entity.notes;
import com.todoapp.repository.NoteRepo;
import com.todoapp.services.Serviceimpl;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class noteController {
    @Autowired
    private final Serviceimpl serviceimpl;

    public noteController(Serviceimpl serviceimpl) {
        this.serviceimpl = serviceimpl;
    }


    @GetMapping("/notes")
    List<notes> getAllNotes(){
        return serviceimpl.getAllNotes();
    }
    @GetMapping("/notes/{id}")
    Optional<notes> findnotebyid(@PathVariable ("id") Long id){
        return serviceimpl.findnotebyid(id);
    }
    @PostMapping("/notes")
    public notes savenotes(@RequestBody notes note) {
        return serviceimpl.savenotes(note);
    }
    @PutMapping("/{id}")
    public notes updatenotes(@PathVariable Long id, @RequestBody notes note) {
        return serviceimpl.updatenotes(id, note);
    }
    @DeleteMapping("/notes/{id}")
        public void deletenotes(@PathVariable ("id") Long id) {
        serviceimpl.deletenotes(id);

    }

}
