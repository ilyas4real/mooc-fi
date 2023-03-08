
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
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();

    }

    public void add(Item item) {
        if (item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            maxWeight -= item.getWeight();
        }
    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
