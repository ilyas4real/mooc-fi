
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        
        System.out.print("Search for? ");
        int numSearch = Integer.valueOf(scanner.nextLine());

        // implement here finding the indices of a number
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number == numSearch) {
                System.out.println(numSearch + " is at index " + i);
            } 
        }
    }
}
