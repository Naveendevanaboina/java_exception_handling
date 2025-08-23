package com.neoteric.order;




public class OrderService {

    public void showProducts() {
        System.out.println("Available Products:");
        System.out.println("1. Laptop - 500");
        System.out.println("2. Mobile - 300");
        System.out.println("3. Headphones - 100");
        System.out.println("4. Tablet - 1550");
    }

    public Order createOrder(int productChoice) throws ProductNotFoundException {
        String productName;
        double amount;

        switch (productChoice) {
            case 1:
                productName = "Laptop";
                amount = 500;
                break;
            case 2:
                productName = "Mobile";
                amount = 300;
                break;
            case 3:
                productName = "Headphones";
                amount = 100;
                break;
            case 4:
                productName = "Tablet";
                amount = 1550;
                break;
            default:
                throw new ProductNotFoundException("Invalid product selection! Please choose 1-4.");
        }

        String orderId = "ORD" + System.currentTimeMillis();
        Order order = new Order(orderId, productName, amount);
        System.out.println("Order Created: " + orderId + " | " + productName + " | " + amount);
        return order;
    }
}
