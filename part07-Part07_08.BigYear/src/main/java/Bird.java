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

public class Bird {
    Scanner scan = new Scanner(System.in);
    private int observations;
    private String name;
    private String latin;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatin() {
        return this.latin;
    }

    public void observation() {
        this.observations += 1;
    }

    public String toString() {
        String observation = "observations";
        if (observations == 1) {
            observation = "observation";
        }
        return name + " (" + latin + "): " + observations + " " + observation;
    }

}
