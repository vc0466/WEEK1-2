// Program to calculate total purchase price based on unit price and quantity

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price (INR): ");
        float unitPrice = sc.nextFloat();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        float totalPrice = unitPrice * quantity;   // Calculate total price

        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        sc.close();
    }
}
