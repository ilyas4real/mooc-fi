/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList toDo;
    private Scanner scanner;

    public UserInterface(TodoList toDo, Scanner scanner) {
        this.toDo = toDo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                toDo.add(toAdd);
            }

            if (command.equals("list")) {
                toDo.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                toDo.remove(toRemove);
            }
        }
    }
}
