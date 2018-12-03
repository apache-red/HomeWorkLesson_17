package com.redcompany.red.library.controller.command.impl;


import com.redcompany.red.library.controller.command.BasicCommand;
import com.redcompany.red.library.data.LibraryCommand;

import java.util.Map;

public class DefaultCommand implements BasicCommand {
    @Override
    public void performAction(LibraryCommand libraryCommand) {
        System.out.println("Incorrect user input");
    }
}
