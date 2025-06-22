import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return productId + " - " + productName + " - " + quantity + " - ₹" + price;
    }
}

class Inventory {
    HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product p) {
        products.put(p.productId, p);
    }

    public void updateProduct(int id, int quantity, double price) {
        if (products.containsKey(id)) {
            Product p = products.get(id);
            p.quantity = quantity;
            p.price = price;
        }
    }

    public void deleteProduct(int id) {
        products.remove(id);
    }

    public void printInventory() {
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct(new Product(101, "Laptop", 10, 55000));
        inv.addProduct(new Product(102, "Mouse", 50, 500));

        inv.updateProduct(102, 40, 450);
        inv.deleteProduct(101);

        inv.printInventory();
    }
}
