
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner reader = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            String found = new String();
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                if (row.equals(searchedFor)) {
                    found = row;
                    System.out.println("Found!");
                    break;
                }
            }
            if (found.isEmpty()) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
