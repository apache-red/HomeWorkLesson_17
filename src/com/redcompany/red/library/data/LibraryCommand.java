package com.redcompany.red.library.data;


import com.redcompany.red.library.entity.Library;

public interface LibraryCommand {

    Library getLibrary();

    void addNewBook(String whichCatalog, String title);
}
