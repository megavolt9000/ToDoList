package src.main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ToDoList_Test {
    protected int count = 0;
    protected int choice;
    protected String task;
    protected List<String> tasks = new ArrayList<>();
    protected List<String> todoList = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        count++;
    }

    public void removeTask(String task) {
        tasks.remove(task);
        count--;
    }

    public void showTask() {
        System.out.println("Задачи на сегодня:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public void showTask(int choice) {
        System.out.println("Задачи на сегодня:");
        for (int i = 0; i < tasks.size(); i++) {
            if (i == choice) {
                System.out.println(tasks.get(i));
            }
        }
    }

    public void showTask(String task) {
        System.out.println("Задачи на сегодня:");
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                System.out.println(tasks.get(i));
            }
        }
    }

    public void showTask(int choice, String task) {
        System.out.println("Задачи на сегодня:");
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task) && i == choice) {
                System.out.println(tasks.get(i));
            }
        }

    }


    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено!");
    }


    //Удление дела по индексу
    public void delete(int index) {
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
