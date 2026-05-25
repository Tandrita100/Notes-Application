package com.example.notes_app.controller;

import com.example.notes_app.entity.Note;
import com.example.notes_app.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note addNote(@RequestBody Note note) {
        return noteService.addNote(note);
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteNoteById(@PathVariable Long id) {
        noteService.deleteNoteById(id);
        return "Deleted Successfully";
    }

    @GetMapping("/search")
    public List<Note> getNoteByTitle(@RequestParam String title) {
        return noteService.findByTitle(title);
    }

    @GetMapping("/category")
    public List<Note> getNoteByCategory(@RequestParam String category){
        return noteService.findByCategory(category);
    }

    @GetMapping("/important")
    public List<Note> getNoteByImportant(@RequestParam String important){
        return noteService.findImportantNotes();
    }

}
