
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int val = Integer.valueOf(scanner.nextLine());

            if (val == 0) {
                break;
            }

            if (val > 0) {
                count += 1;
                sum += val;
            }

        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / count);
        }

    }
}
