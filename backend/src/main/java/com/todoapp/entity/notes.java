package com.todoapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notes")
public class notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "subject")
    private String subject;
    @Column(name = "note")
    private String note;

    public notes() {
    }

    public notes(Long id, String subject, String note) {
        Id = id;
        this.subject = subject;
        this.note = note;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
