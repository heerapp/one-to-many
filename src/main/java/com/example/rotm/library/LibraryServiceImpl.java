package com.example.rotm.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public List<Library> getLibrary() {
        return libraryRepository.findAll();
    }

    @Override
    public Library getLibrary(long libraryId) {
        return libraryRepository.findById(libraryId).get();
    }

    @Override
    public Library addLibrary(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public Library updateLibrary(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public void deleteLibrary(long parseLong) {
        Library library = libraryRepository.getById(parseLong);
        libraryRepository.delete(library);

    }
}
