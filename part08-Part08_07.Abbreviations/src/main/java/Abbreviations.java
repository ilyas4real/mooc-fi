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

public class Abbreviations {
    private HashMap<String, String> abbreviationMap;
    private String abbreviation ;
    
    public Abbreviations() {
        this.abbreviation = "";
        this.abbreviationMap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationMap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviationMap.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        if(this.abbreviationMap.containsKey(abbreviation)) {
            return this.abbreviationMap.get(abbreviation);
        } else {
            return null;
        }
    }
    
}
