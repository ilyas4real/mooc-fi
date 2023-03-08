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
import java.util.Scanner;

public class Database {
    private ArrayList<Bird> birds;
    Scanner scan = new Scanner(System.in);
    
    public Database() {
        this.birds = new ArrayList<>();
}
    
    public void add(Bird bird) {
        birds.add(bird);
    }
    
    public void printAll() {
        for(Bird i : birds) {
            System.out.println(i);
        }
    }
    
    public void printOne(String bird) {
        for(Bird i : birds) {
            if (i.getName().equals(bird)) {
                System.out.println(i.toString());
            } else {
                System.out.println("No bird with this name.");
            }
        }
    }

    public boolean observe(String name) {
        for (Bird bird : birds) {
            if(bird.getName().equals(name)) {
                bird.observation();
                return true;
            }
        }
        return false;
    }    
}
