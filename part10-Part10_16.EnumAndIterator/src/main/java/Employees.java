
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {

    private ArrayList<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        while (iterator.hasNext()) {
            this.list.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();
    
    while (iterator.hasNext()) {
        Person person = iterator.next();
        if (person.getEducation() == education) {
            System.out.println(person);
        }
    }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
    
    
}
