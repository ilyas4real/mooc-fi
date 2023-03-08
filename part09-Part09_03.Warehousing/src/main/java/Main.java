
public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee",10,5);
        pwh.takeFromWarehouse(7);
//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        pwh.printAnalysis();
    }

}
