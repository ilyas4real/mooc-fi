
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
public class Herd implements Movable{
    private ArrayList<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable m : list) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable m : list) {
            m.move(dx, dy);
        }
    }
}
