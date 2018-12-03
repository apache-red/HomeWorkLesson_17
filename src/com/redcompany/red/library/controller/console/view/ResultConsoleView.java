package com.redcompany.red.library.controller.console.view;


import com.redcompany.red.library.entity.Catalog;

import java.util.List;

public class ResultConsoleView {

    public static void showResult(List<Catalog> catalog){
        for (int i = 0; i <  catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }
    }

}
