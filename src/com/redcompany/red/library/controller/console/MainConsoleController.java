package com.redcompany.red.library.controller.console;


import com.redcompany.red.library.controller.command.BasicCommand;
import com.redcompany.red.library.controller.console.view.SimpleConsoleView;
import com.redcompany.red.library.data.LibraryCommand;
import com.redcompany.red.library.data.LibraryData;

import java.util.Map;

import static com.redcompany.red.library.controller.command.CommandManager.defineCommand;

public class MainConsoleController {


    public static void main(String[] args) {


        // создаю БД библиотек
        LibraryCommand libraryData = new LibraryData();

        //создаем консоль
        SimpleConsoleView consoleView = new SimpleConsoleView();

        // запускаем
        consoleView.startConsoleView();

        // получаем сформированный запрос от пользователя в виде Map
        Map<String, Object> userdata = consoleView.readUserInput();

        // Получаем запрос из Map и записываем его в userAction
        Object userAction = userdata.get("user_action");

        // парсим команду и оправляем ее в контроллер обратно получаем модифицированную
        // команду в зависимости от запроса
        BasicCommand command = defineCommand(convertString(userAction));

        // полиморфически вызывается метод на указанной библиотеке
        command.performAction(libraryData);


    }


    private static String convertString(Object obj) {
        return (String) obj;
    }


}
