package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("=== BRIDGE: PAYMENT NOTIFICATIONS ===");

        // Online payment with Email
        new OnlinePaymentNotification(
            new EmailChannel(), "Credit Card").notifyPayment(50);

        // Online payment with SMS
        new OnlinePaymentNotification(
            new SmsChannel(), "PayPal").notifyPayment(30);

        // Cash on delivery with Email
        new CashOnDeliveryPayment(
            new EmailChannel()).notifyPayment(20);

        // Cash on delivery with SMS
        new CashOnDeliveryPayment(
            new SmsChannel()).notifyPayment(25);

        // Bitcoin with Email
        new BitcoinPayment(
            new EmailChannel()).notifyPayment(100);

        // Bitcoin with SMS
        new BitcoinPayment(
            new SmsChannel()).notifyPayment(75);

        // Online payment with Push
        new OnlinePaymentNotification(
            new PushChannel(), "Credit Card").notifyPayment(60);

        // Cash on delivery with Push
        new CashOnDeliveryPayment(
            new PushChannel()).notifyPayment(15);


        System.out.println("\n=== DECORATOR: RESTAURANT ORDER ===");

        // Burger with Cheese and Onions
        FoodItem burger = new Onions(new Cheese(new Burger()));

        // Fries with Ketchup
        FoodItem fries = new Ketchup(new Fries());

        // Hot Dog with Cheese
        FoodItem hotDog = new Cheese(new HotDog());

        // Create customer's order
        Order order = new Order();

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        // Print items and subtotal
        order.printReceipt();

        // Apply Gold loyalty discount
        LoyaltyStatus loyalty =
            new LoyaltyStatus(LoyaltyStatus.Level.GOLD);

        double discountedTotal =
            loyalty.applyDiscount(order.getTotal());

        System.out.printf(
            "Total after Gold discount (10%%): $%.2f%n",
            discountedTotal);
    }
}
