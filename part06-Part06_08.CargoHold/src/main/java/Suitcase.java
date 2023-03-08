/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
}
    public void addItem(Item item) {
        int currentWeight = 0;
        currentWeight += item.getWeight();
        if (currentWeight <= this.maxWeight) {
            this.items.add(item);
            this.maxWeight -= item.getWeight();
        }
    }
    
    public String toString() {
        int count = 0;
        int returnWeight = 0;
        for (Item i : items) {
            count += 1;
            returnWeight += i.getWeight();
        }
        if (this.items.isEmpty()) {
            return "no items (" + returnWeight + " kg)";
        }
        
        if(this.items.size() == 1) {
            return count + " item " + "(" + returnWeight + " kg)";
        }
        return count + " items " + "(" + returnWeight + " kg)";
    }
    
    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item returnObject = this.items.get(0);
        
        for (Item i : this.items) {
            if (returnObject.getWeight() < i.getWeight() ) {
                returnObject = i;
            }
        }
        return returnObject;
    }
    
    
    
}
