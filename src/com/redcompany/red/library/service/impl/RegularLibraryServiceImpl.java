package com.redcompany.red.library.service.impl;



import com.redcompany.red.library.data.LibraryCommand;
import com.redcompany.red.library.entity.Catalog;
import com.redcompany.red.library.entity.Library;
import com.redcompany.red.library.service.LibraryService;

import java.util.List;

public class RegularLibraryServiceImpl implements LibraryService {

    private LibraryCommand libraryCommand;
    private Library library;



    @Override
    public List<Catalog> getCatalogListFromLibrary(LibraryCommand libraryCommand) {
        library =libraryCommand.getLibrary();
        return library.getCatalogList();
    }

//    private LibraryData libraryData;
//    private CatalogService catalogService;


//    @Override
//    public LibraryData getLibrary() {
//
//
//        return libraryData;
//    }
}
