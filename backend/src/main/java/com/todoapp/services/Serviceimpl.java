package com.todoapp.services;

import com.todoapp.entity.notes;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Optional;

public interface Serviceimpl {

        List<notes> getAllNotes();
        Optional<notes> findnotebyid(Long id);
        notes savenotes(notes note);
        notes updatenotes(Long id, notes note);

        void deletenotes(Long id);
}
