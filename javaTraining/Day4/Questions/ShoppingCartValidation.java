package Day4.Questions;

import java.util.Scanner;

public class ShoppingCartValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter items in the cart: ");
        String cartItems = sc.nextLine();
        

        if(!cartItems.isEmpty()) {
            System.out.print("Enter delivery address: ");
            String deliveryAddress = sc.nextLine();

            if(deliveryAddress.equals("Bilsi Road Bisauli")) {
                System.out.println("All the details are valid and ready to checkout your order");
            }
            else {
                System.out.println("Delivery address is not valid. Please enter a valid delivery address");
            }
        }
        else {
            System.out.println("Cart is empty. first add atleast one item in the cart to book the order");
        }
        
        sc.close();
    }
}
