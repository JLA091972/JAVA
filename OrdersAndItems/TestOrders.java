package JAVA.OrdersAndItems;

import java.util.ArrayList;

public class Testorders {
    public static void main(String[] args) {

        item item1 = new item("mocha", 5.99);
        item item2 = new item("latte", 6.99);
        item item3 = new item("drip coffee", 6.99);
        item item4 = new item("capuccino", 3.99);

        // order variables
        order order1 = new order();
        order1.name = "Cindy";
        order1.items.add(item1);
        order1.items.add(item3);
        System.out.println(order1);



        order1.total += order1.items.price;
        order1.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
