package com.redcompany.red.library.service.impl;


import com.redcompany.red.library.data.LibraryCommand;
import com.redcompany.red.library.entity.Book;
import com.redcompany.red.library.entity.Catalog;
import com.redcompany.red.library.entity.Library;
import com.redcompany.red.library.service.LibraryService;

import java.util.List;
import java.util.Map;

public class RegularLibraryServiceImpl implements LibraryService {

    private LibraryCommand libraryCommand;
    private Library library;
    private Catalog catalog;

    private List<Catalog> catalogList;
    private List<Book> bookList;


    @Override
    public List<Catalog> getCatalogListFromLibrary(LibraryCommand libraryCommand) {
        library = libraryCommand.getLibrary();
        return library.getCatalogList();
    }

    @Override
    public Book getBookFromCatalog(Map<String, Object> userdata, LibraryCommand libraryCommand) {
        int catalogNumber = 1;
        int rowNumber = 1;
        catalogNumber = (int) userdata.get("catalog_number");
        rowNumber = (int) userdata.get("row_number");
        catalogList = getCatalogListFromLibrary(libraryCommand);
        catalog = catalogList.get(catalogNumber);
        bookList = catalog.getBooks();

        return bookList.get(rowNumber);
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
