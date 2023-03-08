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
        int i = 1;
        for (String task : list) {
            System.out.println(i + ": " + task);
            i++;
        }
    }
    
    public void remove(int number) {
        int i = 1;
        ArrayList<String> toRemove = new ArrayList<String>();
        for (String task : list) {
            if (number == i) {
                toRemove.add(task);
            }
            i++;
        }
        list.removeAll(toRemove);
    }
    
}
