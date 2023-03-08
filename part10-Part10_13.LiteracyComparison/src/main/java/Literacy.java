/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Literacy {
    private String country;
    private int year;
    private String gender;
    private double ratio;
    
    public Literacy(String country, int year, String gender, double ratio) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.ratio = ratio;
    }
    
    public String getCountry() {
        return country;
    }
 
    public int getYear() {
        return year;
    }
 
    public String getGender() {
        if (this.gender.contains("female")) {
            return "female";
        } else {
            return "male";
        }
    }
 
    public double getRatio() {
        return ratio;
    }
    
}
