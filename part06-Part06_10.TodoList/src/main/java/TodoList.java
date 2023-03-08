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

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        int count = 0;
        for (String i : list) {
            count += 1;
            System.out.println(count + ": " + i);
        }
      
    }
    
    public void remove(int number) {
        int count = 0;
        ArrayList<String> toRemove = new ArrayList<String>();
        for (String i : list) {
            count += 1;
            if (count == number) {
                toRemove.add(i);
            }
        }
        this.list.removeAll(toRemove);
    }
            
    
}
