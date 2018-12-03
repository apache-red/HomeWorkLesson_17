package com.redcompany.red.library.controller.command.impl;

import com.redcompany.red.library.controller.command.BasicCommand;
import com.redcompany.red.library.controller.console.view.ResultConsoleView;
import com.redcompany.red.library.data.LibraryCommand;
import com.redcompany.red.library.entity.Catalog;
import com.redcompany.red.library.service.LibraryService;
import com.redcompany.red.library.service.impl.RegularLibraryServiceImpl;

import java.util.List;

public class ViewAllBooksInAllCatalogs implements BasicCommand {

    private   LibraryService libraryService;
    private List<Catalog> catalogList;

    @Override
    public void performAction(LibraryCommand libraryCommand) {

        libraryService = new RegularLibraryServiceImpl();
        catalogList = libraryService.getCatalogListFromLibrary(libraryCommand);

        ResultConsoleView.showResult(catalogList);

    }
}
