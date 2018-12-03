package com.redcompany.red.library.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Catalog {


    private String responsiblePerson;
    private Date creationData;
    private List<Book> books;

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public Date getCreationData() {
        return creationData;
    }

    public void setCreationData(Date creationData) {
        this.creationData = creationData;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
