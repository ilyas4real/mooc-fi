
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Box implements Packable{
    private double max;
    private ArrayList<Packable> box;
    
    public Box(double maximumCapacity) {
        this.max = maximumCapacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if(this.weight() + packable.weight() <= this.max) {
            this.box.add(packable);
        }
        
    }
    
    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for(Packable i : box) {
            weight += i.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
    
}
