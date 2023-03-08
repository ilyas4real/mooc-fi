/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Person implements Saveable{
    private String name;
    private String address;
    
    public void save() {
        System.out.println("save");
    }
    
    public void delete() {
        System.out.println("delete");
    }
    
    public void load(String address) {
        System.out.println(address);
    }
}
