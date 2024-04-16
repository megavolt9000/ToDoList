import src.main.java.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();

        while (true) {
            int operation = 0;
            try {

                System.out.println("Выберите операцию: \n"
                        + "0. Выход из программы \n"
                        + "1. Добавить дело\n"
                        + "2. Показать дела\n"
                        + "3. Удалить дело по номеру\n"
                        + "4. Удалить дело по названию\n");
                System.out.print("Ваш выбор:");
                //  считывание с консоли
                todoList.setChoice(operation = Integer.parseInt(scanner.nextLine()));
                if (operation == 0) {
                    System.out.println("Программа завершена.");
                    break;
                }
            } catch (NumberFormatException e) {
            }

            switch (operation) {
                case 1:
                    System.out.print("Введите название задачи:");
                    todoList.add(scanner.nextLine());
                    todoList.todoPrint();
                    break;

                case 2:
                    todoList.todoPrint();
                    break;

                case 3:
                    System.out.print("Введите номер задачи для удаления:");
                    try {
                        todoList.deleteByIndex(Integer.parseInt(scanner.nextLine()));
                    } catch (NumberFormatException e) {
                        System.out.println("Введено некорректное значение.");
                    }
                    todoList.todoPrint();

                    break;
                case 4:
                    System.out.print("Введите задачу для удаления:");
                    todoList.deleteByName(scanner.nextLine());
                    todoList.todoPrint();
                    break;

                default:
                    System.out.println("Такой операции нет.");
                    break;
            }
        }
    }
}
