
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class IOU {
    private HashMap<String, Double> hashMap;
    
    public IOU() {
        this.hashMap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.hashMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.hashMap.getOrDefault(toWhom, 0.0);
    }
    
    
    
}
