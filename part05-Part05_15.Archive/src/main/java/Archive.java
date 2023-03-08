/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class Archive {
    private String name;
    private String id;

    public Archive(String id, String name ) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    public boolean equals (Object compared) {
        if (this == compared ) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
    }
        Archive comparedArchive = (Archive) compared;
        
        if(this.id.equals(comparedArchive.id)) {
            return true;
        }
         return false;
    }
    
    public String toString() {
        return this.id + ": " + this.name;
    }
    
}
