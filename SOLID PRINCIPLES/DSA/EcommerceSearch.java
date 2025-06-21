package DSA;
import java.util.*;
public class EcommerceSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]products={"Laptop", "Mobile", "Charger", "Headphones", "Shoes", "Phone Case", "Mouse", "Keyboard","ChargerCable"};
        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine().toLowerCase();
        sc.close();
        System.out.println("Search Results:");
        boolean found=false;
        for(int i=0;i<products.length;i++){
            String product=products[i].toLowerCase();

            if(product.contains(keyword)){
                System.out.println("-" + products[i]);
                found=true;
            }
            
        }
        if(!found){
                System.out.println("No matches Found");
            }
    }
  
}
