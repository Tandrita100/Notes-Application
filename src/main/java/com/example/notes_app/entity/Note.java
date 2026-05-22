package com.example.notes_app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String title;

    private String content;

    private String category;

    private Boolean important;

    private LocalDate date;

    public Note(){

    }

    public Note(Long id, String title, String content, String category, Boolean important, LocalDate date){
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.important = important;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getImportant() {
        return important;
    }

    public void setImportant(Boolean important) {
        this.important = important;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
