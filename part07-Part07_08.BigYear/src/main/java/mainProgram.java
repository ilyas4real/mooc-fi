
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database database = new Database();

        while (true) {
            System.out.print("?");
            String input = scan.nextLine();

            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                database.add(new Bird(name, latin));
            }

            if (input.equals("Observation")) {
                System.out.print("Bird?");
                String name = scan.nextLine();
                if (!(database.observe(name))) {
                    System.out.println("Not a bird!");
                } 
            }
            if (input.equals("All")) {
                database.printAll();
            }
            if (input.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                database.printOne(name);
            }

        }
    }

}
