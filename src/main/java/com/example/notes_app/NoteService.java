package com.example.notes_app;

import com.example.notes_app.entity.Note;
import com.example.notes_app.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    //To add note
    public Note addNote(Note note){
        return noteRepository.save(note);
    }

    //To get all notes
    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    //To get note by id
    public Note getNoteById(Long id){
        return noteRepository.findById(id).orElse(null);
    }

    //To delete note
    public void deleteNoteById(Long id){
        noteRepository.deleteById(id);
    }

    //To search by tittle
    public List<Note> findByTitle(String title){
        return noteRepository.findByTitle(title);
    }

    //To search by category
    public List<Note> findByCategory(String category){
        return noteRepository.findByCategory(category);
    }

    //To search important notes
    public List<Note> findByImportant(){
        return noteRepository.findByImportantTrue();
    }

}
