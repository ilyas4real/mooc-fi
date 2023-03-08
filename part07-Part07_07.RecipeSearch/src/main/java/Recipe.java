/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Recipe {
    private String name;
    private int cookingTime;
    
    public Recipe(String name, int time) {
        this.name = name;
        this.cookingTime = time;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.cookingTime;
    }
    
    public String toString() {
        return this.name + " , cooking time: " + this.cookingTime;
    }
    
}
