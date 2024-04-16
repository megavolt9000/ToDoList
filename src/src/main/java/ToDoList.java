package src.main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToDoList {
    protected int count = 0;
    protected int choice;
    protected List<String> todoList = new ArrayList<>();


    //Добавление в список
    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено!");
    }


    //Удление дела по индексу
    public void deleteByIndex(int index) {
        index--;
        if (index >= 0 && index < (todoList.size())) {
            todoList.remove(index);
            System.out.println("Удалено!");
        } else {
            System.out.println("Задача с этим номером не найдена");
        }
    }


    // удаление дела по названию
    public void deleteByName(String name) {
        Iterator<String> iterator = todoList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(name)) {
                iterator.remove();
                count++;
                System.out.println("Удалено!");
                break;
            }
        }
        if (count == 0) {
            System.out.println("Задача с этим названием не найдена.");
        }
        count = 0;
    }

    //вывод на экран
    public void todoPrint() {
        System.out.printf("Ваш список дел: \n");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.printf("%d. %s \n", i + 1, todoList.get(i));
        }
    }

    public void setChoice(int choice) {
        if (choice >= 0) {
            this.choice = choice;
        } else {
            System.out.println("Отрицательное значение!");
        }
    }
}
