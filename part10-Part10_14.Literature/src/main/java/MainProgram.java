
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(input, age));

        }

        System.out.println(books.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
              .comparing(Book::getAge)
              .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        System.out.println("Books:");
        for (Book e : books) {
            System.out.println(e);
        }
    }

}
