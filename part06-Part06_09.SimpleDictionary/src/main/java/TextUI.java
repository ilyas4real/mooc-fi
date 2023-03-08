/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI (Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        ArrayList<String> added = new ArrayList<>();
        while (true) {
            String word = ""; 
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } 
            
            if (input.equals("add")) {
                System.out.print("Word: ");
                word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dict.add(word, translation);
                added.add(word);
                added.add(translation);
                continue;
            } 
            
            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String wordTranslate = scanner.nextLine();
                if(!(added.contains(wordTranslate))) {
                    System.out.println("Word " + wordTranslate + " was not found");
                } 
                System.out.println("Translation: " + this.dict.translate(wordTranslate));
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
