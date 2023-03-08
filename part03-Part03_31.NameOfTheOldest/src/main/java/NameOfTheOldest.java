
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;
        String name = "";

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            
            for(int i = 0; i < pieces.length; i++) {
                int num = Integer.valueOf(pieces[1]);
                if(biggest < num) {
                    biggest = num;
                    name = pieces[0];
                }
            }
        }
        System.out.println("Age of the oldest: " + name);
    }
}
