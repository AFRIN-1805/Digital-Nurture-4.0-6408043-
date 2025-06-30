package DSA;
import java.util.Scanner;

public class EcommerceSearch {

    // Method to search products based on keyword
    public static void searchProducts(String[] products, String keyword) {
        boolean found = false;
        System.out.println("\nSearch Results:");
        for (int i = 0; i < products.length; i++) {
            String product = products[i].toLowerCase();
            if (product.contains(keyword)) {
                System.out.println("- " + products[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Product list
        String[] products = {
            "Laptop", "Mobile", "Charger", "Headphones", "Shoes", "Phone Case", "Mouse", "Keyboard"
        };

        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine().toLowerCase();

        // Call the search method
        searchProducts(products, keyword);

        sc.close();
    }
}
