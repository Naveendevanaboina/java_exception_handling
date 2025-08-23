package com.neoteric.order;

import java.util.Scanner;




    public class OrderTest {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LoginService loginService = new LoginService();
            OrderService orderService = new OrderService();
            PaymentService paymentService = new PaymentService();

            try {

                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                loginService.login(username, password);


                orderService.showProducts();
                System.out.print("Select product (1-4): ");
                int choice = sc.nextInt();


                Order order = orderService.createOrder(choice);


                sc.nextLine();
                System.out.print("Enter payment method (UPI/CARD): ");
                String method = sc.nextLine();
                paymentService.makePayment(order.getAmount(), method, order.getOrderId());


                System.out.println("🔒 Transaction Completed.");

            } catch (InvalidCredentialsException | InvalidPaymentException |
                     InsufficientBalanceException | ProductNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
