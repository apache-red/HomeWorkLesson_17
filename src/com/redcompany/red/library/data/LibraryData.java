package com.redcompany.red.library.data;


import com.redcompany.red.library.entity.Book;
import com.redcompany.red.library.entity.Catalog;
import com.redcompany.red.library.entity.Library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class LibraryData implements LibraryCommand {

    private Library library;
    private Catalog catalog;


    private List<Catalog> catalogList;
    private List<Book> bookList;

    private int idBook;


    public LibraryData() {
        initLibrary();
    }


    @Override
    public Library getLibrary() {
        return library;
    }

    @Override
    public void addNewBook(String whichCatalog , String title) {

        for (int i = 0; i < catalogList.size() ; i++) {
            catalog = catalogList.get(i);
            if (catalog.getResponsiblePerson().equals(whichCatalog)){
                catalog.addBookToCatalog(new Book(++idBook , title));
            }

        }
        System.out.println();
    }


    private Library initLibrary() {
        //создаю библиотеку
        this.library = new Library();
        catalog = initCatalog();
        //создаю новый каталог c каталогами авторов
        catalogList = library.createNewCatalogList();
        // передаю каталог в каталог лист
         catalogList.add(catalog);

         catalog = initCatalog();
        catalogList.add(catalog);

        return library;
    }

    private Catalog initCatalog() {
        // создаю каталог и настраиваю его. HARDCODE!
        catalog = library.createNewCatalogInLibrary();
        catalog.setCreationData(new Date());
        catalog.setResponsiblePerson("Ivan Ivanov");
        catalog.setBooks(ininBookList());

               return catalog;
    }

    private List<Book> ininBookList() {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(++idBook, "Book1"));
        bookList.add(new Book(++idBook, "Book2"));
        bookList.add(new Book(++idBook, "Book3"));
        bookList.add(new Book(++idBook, "Book4"));
        bookList.add(new Book(++idBook, "Book5"));
        return bookList;
    }




}
