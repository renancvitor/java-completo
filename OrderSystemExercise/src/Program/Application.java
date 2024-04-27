package Program;

import Entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product p = new Product();

        //OrderItem oi1 = new OrderItem(1, 1000.0, p);

        System.out.println("Enter client data:");
        System.out.print("Name:  ");
        String name = sc.nextLine();
        System.out.print("Email:  ");
        String email = sc.next();
        System.out.print("Brith date (DD/MM/YYYY):  ");
        Date bithDate = sdf.parse(sc.next());

        Client client = new Client(name, email, bithDate);

        System.out.println("Enter order data:");
        System.out.print("Status:  ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.print("How many itens to this order?  ");
        int N = sc.nextInt();

        Order order = new Order(new Date(), status, client);

        for (int i = 0; i < N; i++) {
            System.out.println("Enter #" + (i+1) + " item data");
            System.out.print("Product name:  ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price:  ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity:  ");
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
