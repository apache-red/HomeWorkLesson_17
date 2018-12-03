package com.redcompany.red.library.service;


import com.redcompany.red.library.data.LibraryCommand;
import com.redcompany.red.library.entity.Catalog;

import java.util.List;

public interface LibraryService {


//    LibraryData getLibrary();

    List<Catalog> getCatalogListFromLibrary(LibraryCommand libraryCommand);

}
