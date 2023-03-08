
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {

        String printOutput = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printOutput + " is empty.";
        }

        
        String output = "";

        for (String i: this.elements) {
            if (elements.size() == 1) {
                output = output + i;
            } else {
                output = output + i + "\n";
            }
            
        }
        
        if (elements.size() == 1) {
            return printOutput + " has " + this.elements.size() + " element:\n" + output;
        }
        return printOutput + " has " + this.elements.size() + " elements:\n" + output;
    }
}
