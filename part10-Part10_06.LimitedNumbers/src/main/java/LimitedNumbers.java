
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (Integer.valueOf(row) < 0) {
                break;
            }

            list.add(row);
        }
        list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(i -> i >= 1 && i <= 5)
                .forEach(num -> System.out.println(num));
    }
}
