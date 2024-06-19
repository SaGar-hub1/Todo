package com.todoapp.services;

import com.todoapp.entity.notes;
import com.todoapp.repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class servicesnotes implements Serviceimpl {

    @Autowired
    private NoteRepo noteRepo;

    public void servicesnotes(NoteRepo noteRepo){
        this.noteRepo = noteRepo;
    }


    @Override
    public List<notes> getAllNotes() {
        return (List<notes>) noteRepo.findAll();
    }

    @Override
    public Optional<notes> findnotebyid(Long id) {
        return noteRepo.findById(id);
    }

    @Override
    public notes savenotes(notes note) {
        return noteRepo.save(note);
    }

    @Override
    public notes updatenotes(notes note) {
        return noteRepo.save(note);
    }

    @Override
    public void deletenotes(Long id) {
        noteRepo.deleteById(id);

    }
}
