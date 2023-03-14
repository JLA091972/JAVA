package JAVA.OrdersAndItems;

import java.util.ArrayList;

public class order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;


    public order(String name, double total, boolean ready, ArrayList<Item> items) {
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = items;
    }




}
