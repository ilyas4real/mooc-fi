
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int space = height - 1;
        int star = 1;

        for (int i = 0; i < height; i++) {
            
            printSpaces(space);
            printStars(star);
            space--;
            star += 2;
            
            // another possible solution
            // printSpaces(height-i);
            // printStars(i*2 + 1);
        }
        for (int j = 0; j < 2; j++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
