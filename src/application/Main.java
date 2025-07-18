package application;


import entites.Client;
import entites.Enum.OrderStatus;
import entites.Order;
import entites.OrderItem;
import entites.Product;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth Date: ");
        Date birthDate = sdf.parse(sc.nextLine());
        Client client = new Client(name,email,birthDate);

        System.out.println("enter orde data: ");
        System.out.print("status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(),status,client);

        System.out.print("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("enter item #" + (i+1));
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Product quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName,productPrice);
            OrderItem orderItem =  new OrderItem(productQuantity,productPrice,product);

            order.addItem(orderItem);

        }
        System.out.println(order);




        }
    }
