class Product1 {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product1(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return productId + " - " + productName + " - Qty: " + quantity + " - ₹" + price;
    }
}


public class Main2 {
    public static Product1 linearSearch(Product1[] products, String name) {
        for (Product1 p : products) {
            if (p.productName.equalsIgnoreCase(name))
                return p;
        }
        return null;
    }

    public static Product1 binarySearch(Product1[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product1[] products = {
           new Product1(101, "Keyboard", 20, 1500.0),
new Product1(102, "Laptop", 10, 55000.0),
new Product1(103, "Mouse", 100, 500.0),

        };

        // Binary search requires sorting by name
        java.util.Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        Product1 found = binarySearch(products, "Mouse");
        System.out.println(found != null ? "Found: " + found : "Not Found");
    }
}

