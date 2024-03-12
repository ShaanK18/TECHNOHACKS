package com.technohacks;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("** To-Do List Manager **\n");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. View the to-do list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    viewToDoList();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }

    private static void addItem(Scanner scanner) {
        System.out.print("Enter the item to add: ");
        String item = scanner.nextLine();
        toDoList.add(item);
        System.out.println("Item added successfully!");
    }

    private static void removeItem(Scanner scanner) {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is already empty.");
            return;
        }

        System.out.println("Current to-do list:");
        viewToDoList();

        System.out.print("Enter the index of the item to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (index < 0 || index >= toDoList.size()) {
            System.out.println("Invalid index! Please enter a number between 0 and " + (toDoList.size() - 1) + ".");
        } else {
            String removedItem = toDoList.remove(index);
            System.out.println("Item \"" + removedItem + "\" removed successfully!");
        }
    }

    private static void viewToDoList() {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println(i + ". " + toDoList.get(i));
            }
        }
    }
}

