
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int largest = 0;
        String name = new String();

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");

            sum = sum + Integer.valueOf(pieces[1]);
            count = count + 1;
            
            int len = pieces[0].length();
            
            if(largest < len){
                largest = len;
                name = pieces[0];
            }

        }
        System.out.println("Longest name: " + name);
        
        if (count > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }

    }
}
