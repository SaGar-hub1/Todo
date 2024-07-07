package com.todoapp.services;

import com.todoapp.entity.notes;
import com.todoapp.repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
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
    public notes updatenotes(Long id, notes note) {

        notes note1 = null;
        try {
            note1 = noteRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException());
        } catch ( RuntimeException e) {
            throw new RuntimeException(e);
        }

        note1.setNote(note.getNote());
        note1.setId(note1.getId());
        note1.setSubject(note.getSubject());

        return noteRepo.save(note1);

        //return noteRepo.save(note);
    }

    @Override
    public void deletenotes(Long id) {
        noteRepo.deleteById(id);

    }
}
