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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold (int max) {
        this.maxWeight = max;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        currentWeight += suitcase.totalWeight();
        if (currentWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.maxWeight -= suitcase.totalWeight();
        }
    }
    
    public String toString() {
        int count = 0;
        int returnWeight = 0;
        for (Suitcase i : suitcases) {
            count += 1;
            returnWeight += i.totalWeight();
        }
        return count + " suitcases " + "(" + returnWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase i : this.suitcases) {
            i.printItems();
        }
    }
    
}
