
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fora
 */
public class Warehouse {

    private Map<String, Integer> warehouse;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        warehouse.put(product, price);
        stockBalance.put(product, stock);
    }

    public int price(String product) {
        return warehouse.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stockBalance.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (!stockBalance.containsKey(product)) {
            return false;
        }
        
        int currentStock = stockBalance.get(product);
        if (stockBalance.get(product) > 0) {
            stockBalance.put(product, currentStock - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for (String i : stockBalance.keySet()) {
            set.add(i);
        }
        return set;
    }
}


