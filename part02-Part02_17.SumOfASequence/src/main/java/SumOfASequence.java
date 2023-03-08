
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = 0;
        System.out.print("Last number? ");
        int sum = Integer.valueOf(scanner.nextLine());
        
        for(int i = 1; i <= sum; i++) {
            input += i;
        }
        System.out.println("The sum is "+input);
    }
}
