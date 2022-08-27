package com.udemy.oitoExercFix.aplication;

import com.udemy.oitoExercFix.entites.Client;
import com.udemy.oitoExercFix.entites.Order;
import com.udemy.oitoExercFix.entites.OrderItem;
import com.udemy.oitoExercFix.entites.Product;
import com.udemy.oitoExercFix.entitie.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class programExercFx {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //testes:
//        Product p = new Product("TV", 1000.0);
//        OrderItem oi1 = new OrderItem(2, 1000.0, p);
//        Client cli = new Client("Marcos", "marcos@gmail.com", sdf.parse("28/02/2022"));

        //testes:
//        System.out.println();
//        System.out.println(oi1.getQuantity());
//        System.out.println(oi1.getPrice());
//        System.out.println(oi1.getProduct().getName());
//        System.out.println(oi1.getProduct().getPrice());
//        System.out.println(oi1);
//        System.out.println();
//        System.out.println(cli);

        System.out.println("");
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        System.out.println();

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next()); //valueOff converte string para OrderStatus

        Order order = new Order(new Date(), status, client); //new Date() instancia o horário atual do sistema

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);


        }

        System.out.println();

        System.out.println(order);


        sc.close();
    }
}