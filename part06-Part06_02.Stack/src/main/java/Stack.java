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

public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
    this.list = new ArrayList<>();
}
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        int last = list.size() - 1;
        return this.list.remove(last);
    }
    
}
