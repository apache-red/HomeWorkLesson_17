package com.redcompany.red.library.entity;


import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String libraryName = "MyLibrary";
    private List<Catalog> catalogList;

    private Catalog catalog;




    public void addCatalogToLibrary(Catalog catalog){
        catalogList.add(catalog);
    }

    public  Catalog getCatalogFromCatalogList(Library library, int catalogNumber){
       return library.catalogList.get(catalogNumber);
    }

    public Catalog createNewCatalogInLibrary(){
        return this.catalog = new Catalog();
    }
    public  List<Catalog> createNewCatalogList(){
        return catalogList = new ArrayList<>();
    }



}
