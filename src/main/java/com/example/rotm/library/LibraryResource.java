package com.example.rotm.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryResource {
    @Autowired
    private LibraryService libraryService;

    @GetMapping("/libraries")
    public List<Library> getlibraries(){
        return this.libraryService.getLibrary();
    }

    @GetMapping("/libraries/{libraryId}")
    public Library getLibrary(@PathVariable String libraryId){
        return this.libraryService.getLibrary(Long.parseLong(libraryId));
    }

    @PostMapping("/libraries")
    public Library addLibrary(@RequestBody Library library){
        return this.libraryService.addLibrary(library);
    }

    @PutMapping("/libraries")
    public Library updateLibrary(@RequestBody Library library){
        return this.libraryService.updateLibrary(library);
    }

    @DeleteMapping("/libraries/{libraryId}")
    public ResponseEntity<HttpStatus> deleteLibrary(@PathVariable String libraryId){
        try{
            this.libraryService.deleteLibrary(Long.parseLong(libraryId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
