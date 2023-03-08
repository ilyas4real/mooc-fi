
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            list.add(row);
        }

        double averagePositive = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average().getAsDouble();

        double negative = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average().getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        if (command.equals("n")) {
            System.out.println("Average of the negative numbers:" + negative);
        } else {
            System.out.println("Average of the positive numbers: " + averagePositive);
        }
    }
}
