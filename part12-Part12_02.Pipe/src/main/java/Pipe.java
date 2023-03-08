
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
public class Pipe <T>{
    private ArrayList<T> list;
    
    public Pipe() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.list.add(value);
    }
    
    public T takeFromPipe() {
        if (list.isEmpty()) {
            return null;
        }
        
        return this.list.remove(0);
    }
    
    public boolean isInPipe() {
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
    
    
}
