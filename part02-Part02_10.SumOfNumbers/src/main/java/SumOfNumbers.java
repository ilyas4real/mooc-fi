
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());

            if (val == 0) {
                break;
            } else {
                count += val;
            }
        }
        System.out.println("Sum of the numbers: " +count);

    }
}
