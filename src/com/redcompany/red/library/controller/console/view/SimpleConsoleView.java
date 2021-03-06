package com.redcompany.red.library.controller.console.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleConsoleView {


    // итог класса mapa с action и названием команды
    // Это V в MVC

    public Map<String, Object> userInput = new HashMap<>();


    public void startConsoleView() {
        showBasicMenu();

    }

    private void showBasicMenu() {
        System.out.println("1 - show all books in all catalogs");
        System.out.println("2 - view single catalog row");
        System.out.println("3 - find book by title");
        System.out.println("4 - add new book");
        System.out.println("5 - find book by author");
        System.out.println("0 - Exit");
    }

    public Map<String, Object> readUserInput() {
        int item = readMenuItem();
        getInputData(item);

        return userInput;
    }
    // далее нужна проверка на наличие такой строки и каталога !!!!!!!!!!
    private void getInputData(int menuItem) {
        int number =0;
        String name;
        switch (menuItem) {
            case 1:
                userInput.put("user_action", "viewAll_books_allCatalogs");
                break;
            case 2:
                System.out.println("Enter catalog number");
                number = readMenuItem();
                userInput.put("user_action", "single_row");
                userInput.put("catalog_number", number);
                System.out.println("Enter row number");
                number = readMenuItem();
                userInput.put("row_number", number);
                break;
            case 3:
                userInput.put("user_action", "find_book");
                System.out.println("Enter the name of the book you want to find (Book1, Book2...)");
                name = readMenuItemString();
                userInput.put("book_title", name);
                break;
            case 4:
                userInput.put("user_action", "add_book");
                System.out.println("Enter in which catalog add book (Ivan Ivanov...)");
                name = readMenuItemString();
                userInput.put("which_catalog", name);
                System.out.println("Enter title of the book");
                name = readMenuItemString();
                userInput.put("book_title", name);
                break;
            case 5:
                userInput.put("user_action", "find_books_by_author");
                System.out.println("Enter author(catalog) name (Ivan Ivanov...)");
                name = readMenuItemString();
                userInput.put("find_author", name);
                break;
            case 0:
                System.exit(0);
                break;
        }

    }

    private int readMenuItem() {
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("!Exeption! Enter a number");
            readMenuItem();
        }
        return number;
    }

    private String readMenuItemString() {
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }


}
