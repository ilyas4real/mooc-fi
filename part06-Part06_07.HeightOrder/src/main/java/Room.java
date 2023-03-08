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

public class Room {
    private ArrayList<Person> list;
    
    public Room () {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person returnObject = this.list.get(0);
        
        for (Person i : list) {
            if (returnObject.getHeight() > i.getHeight()) {
                returnObject = i;
            }
        }
        return returnObject;
    }
    
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        this.list.remove(shortest);
        return shortest;
    }
        
}
