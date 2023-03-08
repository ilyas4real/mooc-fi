
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) {
                break;
            }
            
            list.add(row);
        }
        list.stream().forEach(string -> System.out.println(string));

    }
}
