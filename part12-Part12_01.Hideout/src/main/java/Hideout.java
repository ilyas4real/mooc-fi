
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Hideout<T> {
    private T hidden;
    
    public Hideout() {
    }
    
    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }
    
    public T takeFromHideout() {
        if(hidden == null) {
            return null;
        }
        T taken = this.hidden;
        hidden = null;
        return taken;
        
    }
    
    public boolean isInHideout() {
        if (this.hidden == null) {
            return false;
        } 
        return true;
    }
}
