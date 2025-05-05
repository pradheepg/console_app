import java.util.*;

public class Billing {
    private List<Product> productList;
    private List<Cart> cart;
    private final double TAX_RATE = 0.05;

    public Billing() {
        productList = new ArrayList<>();
        cart = new ArrayList<>();
        initializeProducts();
    }

    private void initializeProducts() {
        productList.add(new Product(1, "Apple", 0.99));
        productList.add(new Product(2, "Bread", 1.99));
        productList.add(new Product(3, "Milk", 2.49));
        // Add more products as needed
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product p : productList) {
            System.out.println(p.getId() + ": " + p.getName() + " - $" + p.getPrice());
        }
    }

    public void addToCart(int productId, int quantity) {
        for (Product p : productList) {
            if (p.getId() == productId) {
                cart.add(new Cart(p, quantity));
                return;
            }
        }
        System.out.println("Product ID not found.");
    }

    public void generateReceipt() {
        double subtotal = 0;
        System.out.println("\nReceipt:");
        for (Cart item : cart) {
            double totalPrice = item.getProduct().getPrice() * item.getQuantity();
            subtotal += totalPrice;
            System.out.println(item.getProduct().getName() + " x" + item.getQuantity() + " - $" + totalPrice);
        }
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (5%): $" + tax);
        System.out.println("Total: $" + total);
    }
}
