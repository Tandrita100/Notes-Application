package com.example.notes_app.repository;

import com.example.notes_app.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

     List<Note> findByTitle(String title);

     List<Note> findByCategory(String category);

     List<Note> findByImportantTrue();

}
