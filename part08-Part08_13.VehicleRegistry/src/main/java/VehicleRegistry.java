/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.hashmap.containsKey(licensePlate)) {
            this.hashmap.put(licensePlate, owner);
            return true;
        }
        return false;
        
    }
    
    public String get(LicensePlate licensePlate) {
        return hashmap.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.hashmap.containsKey(licensePlate)) {
            this.hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate i : hashmap.keySet()) {
            System.out.println(i);
        }
    }
    
    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        for (String i : hashmap.values()) {
            if (!list.contains(i)) {
                System.out.println(i);
                list.add(i);
            } 
   
        }
        
    }
    
}
