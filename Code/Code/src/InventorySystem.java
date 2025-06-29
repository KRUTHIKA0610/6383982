import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return productId + " " + productName + " Qty: " + quantity + " Price: " + price;
    }
}

public class InventorySystem {
    static Map<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    static void updateProduct(int id, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    static void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        addProduct(new Product(101, "Monitor", 10, 15000));
        addProduct(new Product(102, "Keyboard", 50, 500));
        updateProduct(101, 12, 14500);
        deleteProduct(102);
        displayInventory();
    }
}
