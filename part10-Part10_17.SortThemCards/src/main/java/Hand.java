
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = hand.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int compareTo(Hand hand) {
        int value1 = 0;
        int value2 = 0;
        Iterator<Card> iterator = this.hand.iterator();
        while (iterator.hasNext()) {
            value1 += iterator.next().getValue();
        }
        Iterator<Card> iterator2 = hand.hand.iterator();
        while (iterator2.hasNext()) {
            value2 += iterator2.next().getValue();
        }
        
        return value1 - value2;
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
              .comparing(Card::getSuit)
              .thenComparing(Card::getValue);
        
        Collections.sort(hand, comparator);
    }
    
}
