package eisya;

import java.util.Scanner;

public class PaymentReceipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item1, item2;
        int quantity1, quantity2;
        double price1, price2;
        double amount1, amount2;
        double subtotal, tax, serviceCharge, total;

        // Input for item 1
        System.out.print("Item 1: ");
        item1 = input.nextLine();

        System.out.print("Quantity: ");
        quantity1 = input.nextInt();

        System.out.print("Unit Price (RM): ");
        price1 = input.nextDouble();
        input.nextLine();

        // Input for item 2
        System.out.print("Item 2: ");
        item2 = input.nextLine();

        System.out.print("Quantity: ");
        quantity2 = input.nextInt();

        System.out.print("Unit Price (RM): ");
        price2 = input.nextDouble();

        // Calculations
        amount1 = quantity1 * price1;
        amount2 = quantity2 * price2;

        subtotal = amount1 + amount2;
        tax = subtotal * 0.06;
        serviceCharge = subtotal * 0.10;
        total = subtotal + tax + serviceCharge;

        // Display receipt
        System.out.println("\n========== PAYMENT RECEIPT ==========");

        System.out.println("\nItem 1: " + item1);
        System.out.println("Quantity: " + quantity1);
        System.out.printf("Unit Price: RM%.2f%n", price1);
        System.out.printf("Amount: RM%.2f%n", amount1);

        System.out.println("*****************************");

        System.out.println("\nItem 2: " + item2);
        System.out.println("Quantity: " + quantity2);
        System.out.printf("Unit Price: RM%.2f%n", price2);
        System.out.printf("Amount: RM%.2f%n", amount2);

        System.out.println("\n--------------------------------------");
        System.out.printf("Subtotal: RM%.2f%n", subtotal);
        System.out.printf("Government Tax (6%%): RM%.2f%n", tax);
        System.out.printf("Service Charge (10%%): RM%.2f%n",
                          serviceCharge);
        System.out.println("--------------------------------------");
        System.out.printf("Total Payment: RM%.2f%n", total);
        System.out.println("======================================");

        input.close();
    }
}
