package com.redcompany.red.library.controller.console;


import com.redcompany.red.library.data.LibraryCommand;
import com.redcompany.red.library.data.LibraryData;

public class MainConsoleController {


    public static void main(String[] args) {


        // создаю БД библиотек
        LibraryCommand libraryData = new LibraryData();
        System.out.println();


//
//        //создаем консоль
//        SimpleConsoleView consoleView = new SimpleConsoleView();
//        // запускаем
//        consoleView.startConsoleView();
//        // получаем сформированный запрос от пользователя в виде Map
//        Map<String, Object> userdata = consoleView.readUserInput();
//        // Получаем запрос из Map и записываем его в userAction
//        Object userAction = userdata.get("user_action");
//
//        // парсим команду и оправляем ее в контроллер обратно получаем модифицированную
//        // команду в зависимости от запроса
//        BasicCommand command = defineCommand(convertString(userAction));
//
//        // полиморфически вызывается метод
//        command.performAction(userdata, libraryData);



}


    private static String convertString(Object obj) {
        return (String) obj;
    }


}
