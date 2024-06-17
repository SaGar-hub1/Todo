package com.todoapp.repository;

import com.todoapp.entity.notes;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends JpaRepository<notes, Long> {

}
