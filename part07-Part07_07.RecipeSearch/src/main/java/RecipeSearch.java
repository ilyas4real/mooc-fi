
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program");

        ArrayList<Recipe> recipes = readFromFile(file);

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println(recipes);
            }
        }
    }

    public static ArrayList<Recipe> readFromFile(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        int index = 0;
        String name;
        int time;

        try ( Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                
                
                
                String[] parts = line.split("\n\r");
                String homeTeam = parts[0];
                System.out.println(homeTeam);
                
            }
        } catch (Exception e) {
            System.out.println("Failed to read from file." + e);
        }

        return recipes;

    }

}
