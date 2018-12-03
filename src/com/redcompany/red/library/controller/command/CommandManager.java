package com.redcompany.red.library.controller.command;

import com.redcompany.red.library.controller.command.impl.*;

public class CommandManager {

    // это С в MVC . принимает команду от V и передает ее

    private static BasicCommand command = new DefaultCommand();

    public static BasicCommand defineCommand(String action){
        switch (action){
            case "viewAll_books_allCatalogs":
                    command = new ViewAllBooksInAllCatalogs();
                break;
            case "single_row":
      //          command = new ViewSingleCatalogRowCommand();
                break;
            case "find_book":
        //        command = new ViewBookFindByTitleCommand();
                break;
            case "add_book":
        //        command = new AddNewBookToCatalogCommand();
                break;
            case "test_test":
        //        command = new ViewBookLibraryCommand();
                break;
        }
        return command;
    }
}
