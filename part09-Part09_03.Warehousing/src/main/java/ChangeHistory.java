
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory() {
        this.list = new ArrayList<>();
    }
    
    public void add(double status) {
        this.list.add(status);
    }
    
    public void clear() {
        this.list.clear();
    }
    
    public String toString() {
        return this.list.toString();
    }
    
    public double maxValue() {
        double max = this.list.get(0);
        
        if(this.list.isEmpty()) {
            return 0;
        }
        
        for (double i : this.list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    
    public double minValue() {
        double min = this.list.get(0);
        
        if(this.list.isEmpty()) {
            return 0;
        }
        
        for (double i : this.list) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
    
    public double average() {
        double count = 0;
        double sum = 0;
        
        if(this.list.isEmpty()) {
            return 0;
        }
        
        for (double i : this.list) {
            sum += i;
            count++;
           
        }
        return sum/count;
    }
    
}
