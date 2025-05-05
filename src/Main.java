import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Billing billingSystem = new Billing();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            billingSystem.displayProducts();
            System.out.print("Enter Product ID to add to cart: ");
            int productId = scanner.nextInt();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            billingSystem.addToCart(productId, quantity);
            System.out.print("Add more products? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        billingSystem.generateReceipt();
        scanner.close();
    }
}