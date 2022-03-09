package com.example.rotm.library;

import java.util.List;

public interface LibraryService {

    public List<Library> getLibrary();

    public Library getLibrary(long libraryId);

    public Library addLibrary(Library library);

    public Library updateLibrary(Library library);

    public void deleteLibrary(long parseLong);
}
