package JAVA.OrdersAndItems;

import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        item item1 = new item("mocha", 5.99);
        item item2 = new item("latte", 6.99);
        item item3 = new item("drip coffee", 6.99);
        item item4 = new item("capuccino", 3.99);

        System.out.println(item1.price);
        System.out.println(item2.price);
        System.out.println(item3.price);
        System.out.println(item4.price);

        // // Order variables -- order1, order2 etc.
        order order1 = new order("Cindhuri", 10.99, false, "item1, item2");
        order order1 = new order("Jimmy", 5.99, true, "item1");
        order order1 = new order("Noah", 15.99, false, {item1, item2, item3});
        order order1 = new order("Sam", 20.99, true, null)

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
