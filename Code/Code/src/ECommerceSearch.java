import java.util.*;

class Product1 implements Comparable<Product1> {
    int productId;
    String productName;
    String category;

    Product1(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int compareTo(Product1 other) {
        return this.productName.compareTo(other.productName);
    }
}

public class ECommerceSearch {
    static Product1 linearSearch(Product1[] products, String name) {
        for (Product1 p : products) {
            if (p.productName.equalsIgnoreCase(name)) return p;
        }
        return null;
    }

    static Product1 binarySearch(Product1[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product1[] products = {
            new Product1(101, "Laptop", "Electronics"),
            new Product1(102, "Chair", "Furniture"),
            new Product1(103, "Watch", "Accessories"),
            new Product1(104, "Phone", "Electronics"),
            new Product1(105, "Table", "Furniture")
        };

        Product1 linearResult = linearSearch(products, "Watch");

        Arrays.sort(products);
        Product1 binaryResult = binarySearch(products, "Watch");

        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult.productName : "Not Found"));
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult.productName : "Not Found"));
    }
}

