package com.redcompany.red.library.service;


import com.redcompany.red.library.data.LibraryCommand;
import com.redcompany.red.library.entity.Book;
import com.redcompany.red.library.entity.Catalog;

import java.util.List;
import java.util.Map;

public interface LibraryService {


//    LibraryData getLibrary();

    List<Catalog> getCatalogListFromLibrary(LibraryCommand libraryCommand);

    Book getBookFromCatalog(Map<String, Object> userdata, LibraryCommand libraryCommand);

    List<Book> findBookByNameInCatalog(Map<String, Object> userdata, LibraryCommand libraryCommand);

}
