package com.example.notes_app.service;

import com.example.notes_app.entity.Note;
import com.example.notes_app.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    public Note addNote(Note note){
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id){
        return noteRepository.findById(id).orElse(null);
    }

    public void deleteNoteById(Long id){
        noteRepository.deleteById(id);
    }

    public List<Note> findByTitle(String title){
        return noteRepository.findByTitle(title);
    }

    public List<Note> findByCategory(String category){
        return noteRepository.findByCategory(category);
    }

    public List<Note> findImportantNotes(){
        return noteRepository.findByImportantTrue();
    }

    public Note updateNote(Long id, Note updateNote){

        Note existingNote = noteRepository.findById(id).orElse(null);

        if(existingNote != null){
            existingNote.setTitle(updateNote.getTitle());
            existingNote.setContent(updateNote.getContent());
            existingNote.setCategory(updateNote.getCategory());
            existingNote.setImportant(updateNote.getImportant());
            existingNote.setDate(updateNote.getDate());

            return noteRepository.save(existingNote);
        }
        return null;
    }
}
